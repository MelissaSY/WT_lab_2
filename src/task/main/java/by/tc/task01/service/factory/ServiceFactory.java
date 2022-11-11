package by.tc.task01.service.factory;

import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {}

    /**
     *
     * @return appliance service implementation
     */
    public ApplianceService getApplianceService() {

        return applianceService;
    }

    /**
     *
     * @return instance of service factory
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}
