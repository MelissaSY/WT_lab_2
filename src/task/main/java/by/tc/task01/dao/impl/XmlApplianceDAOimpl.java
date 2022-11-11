package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Uses files in xml format as its database
 */
public class XmlApplianceDAOimpl implements ApplianceDAO {
    /**
     * Tries to find appliances that satisfies the given criteria
     * @param criteria
     * @return
     * @throws DAOException
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        List<Appliance> appliances;
        try{
            File resources = new File("src/task/main/resources/resources.xml");
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            if(criteria.getGroupSearchName().equalsIgnoreCase("price")){
                XmlPriceHandler priceHandler = new XmlPriceHandler();
                saxParser.parse(resources, priceHandler);
                appliances = priceHandler.getAppliances();
            }
            else {
                XmlGroupHandler groupHandler = new XmlGroupHandler(criteria);
                saxParser.parse(resources, groupHandler);
                appliances = groupHandler.getAppliances();
            }
        } catch (Exception e) {
            throw new DAOException(e);
        }
        return appliances;
    }
    private class XmlGroupHandler extends DefaultHandler {
        private Criteria criteria;
        private List<Appliance> appliances;
        public XmlGroupHandler(Criteria criteria) {
            this.criteria = criteria;
            appliances = new ArrayList<>();
        }
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if(qName.equalsIgnoreCase(criteria.getGroupSearchName())) {
                try {
                    Appliance appliance = getApplianceXml(qName, attributes);
                    if(appliance != null){
                        appliances.add(appliance);
                    }
                }
                catch (NumberFormatException | NullPointerException e) {
                    throw new SAXException(e);
                }
                /*int count = 0;
                for(int i=0;i<attributes.getLength();i++){
                    String attributeLocalName = attributes.getLocalName(i);
                    Object constraints = criteria.get(attributeLocalName);
                    if(constraints == null || constraints.toString().equalsIgnoreCase(attributes.getValue(i))) {
                        count++;
                    }
                }
                if(count == attributes.getLength()) {
                    Appliance appliance = getApplianceXml(qName, attributes);
                    if(appliance != null){
                    appliances.add(appliance);
                    }
                }*/
            }
        }
        public List<Appliance> getAppliances() {
            return appliances;
        }
    }
    private class XmlPriceHandler extends DefaultHandler {
        private List<Appliance> appliances = new ArrayList<>();
        int price = Integer.MAX_VALUE;
        public XmlPriceHandler() {
        }
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            String attributeValue = attributes.getValue("price");
            try {
                if(attributeValue != null) {
                    int newPrice = Integer.parseInt(attributeValue);
                    if(newPrice < price)
                    {
                        price = Integer.parseInt(attributeValue);
                        appliances.clear();
                        appliances.add(getApplianceXml(qName, attributes));
                    } else if (newPrice == price) {
                        Appliance appliance = getApplianceXml(qName, attributes);
                        if(appliance != null){
                            appliances.add(appliance);
                        }
                    }
                }
            }
            catch (NumberFormatException | NullPointerException e) {
                throw new SAXException(e);
            }
        }

        public List<Appliance> getAppliances() {
            return appliances;
        }
    }
    private Appliance getApplianceXml(String qName, Attributes attributes) throws NumberFormatException, NullPointerException {
        if(qName.equalsIgnoreCase("kettle")) {
            return getKettleXml(attributes);
        } else if (qName.equalsIgnoreCase("laptop")) {
            return getLaptopXml(attributes);
        } else if (qName.equalsIgnoreCase("oven")) {
            return getOvenXml(attributes);
        } else if (qName.equalsIgnoreCase("refrigerator")) {
            return getRefrigeratorXml(attributes);
        } else if (qName.equalsIgnoreCase("tabletPC")) {
            return getTablePCXml(attributes);
        }
        return null;
    }
    private Kettle getKettleXml(Attributes attributes) throws NumberFormatException, NullPointerException {
        int price = Integer.parseInt(attributes.getValue("price"));
        double volume = Double.parseDouble(attributes.getValue("volume"));
        int weight = Integer.parseInt(attributes.getValue("weight"));
        int height = Integer.parseInt(attributes.getValue("height"));
        String color = attributes.getValue("color");
        return new Kettle(price, volume, weight, height, color);
    }
    private Laptop getLaptopXml(Attributes attributes) throws NumberFormatException, NullPointerException {
        int price = Integer.parseInt(attributes.getValue("price"));
        double batteryCapacity = Double.parseDouble(attributes.getValue("batteryCapacity"));
        String os = attributes.getValue("os");
        int memoryRom = Integer.parseInt(attributes.getValue("memoryRom"));
        int systemMemory = Integer.parseInt(attributes.getValue("systemMemory"));
        double cpu = Double.parseDouble(attributes.getValue("cpu"));
        double displayInches = Double.parseDouble(attributes.getValue("displayInches"));
        return new Laptop(price, batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }
    private Oven getOvenXml(Attributes attributes) throws NumberFormatException, NullPointerException{
        int price = Integer.parseInt(attributes.getValue("price"));
        int powerConsumption = Integer.parseInt(attributes.getValue("powerConsumption"));
        int weight = Integer.parseInt(attributes.getValue("weight"));
        int capacity = Integer.parseInt(attributes.getValue("capacity"));
        double depth = Double.parseDouble(attributes.getValue("depth"));
        double height = Double.parseDouble(attributes.getValue("height"));
        double width = Double.parseDouble(attributes.getValue("width"));
        return new Oven(price, powerConsumption, weight, capacity, depth, height, width);
    }
    private Refrigerator getRefrigeratorXml(Attributes attributes) throws NumberFormatException, NullPointerException {
        int price = Integer.parseInt(attributes.getValue("price"));
        int powerConsumption = Integer.parseInt(attributes.getValue("powerConsumption"));
        int freezerCapacity = Integer.parseInt(attributes.getValue("freezerCapacity"));
        double overallCapacity = Double.parseDouble(attributes.getValue("overallCapacity"));
        int weight = Integer.parseInt(attributes.getValue("weight"));
        int height = Integer.parseInt(attributes.getValue("height"));
        int width = Integer.parseInt(attributes.getValue("width"));
        return new Refrigerator(price, powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }
    private TabletPC getTablePCXml(Attributes attributes) throws NumberFormatException, NullPointerException {
        int price = Integer.parseInt(attributes.getValue("price"));
        int batteryCapacity = Integer.parseInt(attributes.getValue("batteryCapacity"));
        int displayInches = Integer.parseInt(attributes.getValue("displayInches"));
        int memoryRom = Integer.parseInt(attributes.getValue("memoryRom"));
        int flashMemoryCapacity = Integer.parseInt(attributes.getValue("flashMemoryCapacity"));
        String color = attributes.getValue("color");
        return new TabletPC(price, batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }
}
