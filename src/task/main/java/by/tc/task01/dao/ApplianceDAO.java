package by.tc.task01.dao;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Has direct access to a database
 */
public interface ApplianceDAO {
    /**
     * Tries to find suitable appliances in the database
     * @param criteria
     * @return
     * @throws DAOException
     */
    List<Appliance> find(Criteria criteria) throws DAOException;
}
