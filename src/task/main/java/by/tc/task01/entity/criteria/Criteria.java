package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Sets searched values
 */
public class Criteria {
    private String groupSearchName;

    private Map<String, Object> criteria;

    /**
     * crates an instance of criteria
     */
    public Criteria() {
        criteria = new HashMap<>();
    }

    /**
     * defines the type of appliance to search (can be set to price)
     * @param groupSearchName
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    /**
     *
     * @return desired type of appliances or price
     */
    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * adds values of characteristic to search
     * @param searchCriteria
     * @param value
     */
    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    /**
     *
     * @param criteriaName
     * @return constraints on characteristic
     */
    public Object get(String criteriaName) {
        if(!criteria.containsKey(criteriaName.toUpperCase()))
            return null;
        return criteria.get(criteriaName);
    }
}
