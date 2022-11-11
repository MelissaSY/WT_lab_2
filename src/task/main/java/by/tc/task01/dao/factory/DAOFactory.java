package by.tc.task01.dao.factory;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.XmlApplianceDAOimpl;

/**
 * helps reduce number of creating instances
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new XmlApplianceDAOimpl();
    private DAOFactory() {}

    /**
     *
     * @return instance of the class that implements applianceDAO
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    /**
     *
     * @return DAOFactory
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}
