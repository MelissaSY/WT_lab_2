package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.exception.ServiceException;

import java.util.List;

/**
 * Has an ability to communicate with DAO
 */
public interface ApplianceService {
    /**
     * Searches for suitable appliances in the database using DAO
     * @param criteria
     * @return
     * @throws ServiceException
     */
    List<Appliance> find(Criteria criteria) throws ServiceException;

}
