package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.factory.ServiceFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        try {
            Criteria criteriaKettle = new Criteria(SearchCriteria.Kettle.class.getSimpleName());
            appliances = service.find(criteriaKettle);
            System.out.println("Kettles:");
            PrintApplianceInfo.print(appliances);
        }catch (ServiceException e) {
            System.out.printf("Something went wrong :(\nMessage: %s\n", e.getMessage());
        }
        try {
            Criteria criteriaPrice = new Criteria(SearchCriteria.Price.class.getSimpleName());
            appliances = service.find(criteriaPrice);
            System.out.println("Cheapest appliance:");
            PrintApplianceInfo.print(appliances);
        }catch (ServiceException e) {
        System.out.printf("Something went wrong :(\nMessage: %s\n", e.getMessage());
        }

    }
}
