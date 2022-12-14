package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.dao.factory.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;

import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.validation.Validator;

import java.util.List;

/**
 * Implementation of ApplianceService
 */
public class ApplianceServiceImpl implements ApplianceService {
    /**
     * Finds appliances using DAO
     * @param criteria
     * @return suitable appliances
     * @throws ServiceException
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliances;

        try {
            appliances = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }
}
