package by.tc.task01.service.validation;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Arrays;

/**
 * The class is used to verify the chosen criteria
 */
public class Validator {
    /**
     * Checks whether criteria satisfy the constraints
     * @param criteria
     * @return boolean value that indicates whether such criteria can be used
     */
    public static boolean criteriaValidator(Criteria criteria) {
        String[] appliances = {"oven", "kettle", "laptop", "refrigerator", "tabletpc", "price"};
        return Arrays.asList(appliances).contains(criteria.getGroupSearchName().toLowerCase());
    }
}
