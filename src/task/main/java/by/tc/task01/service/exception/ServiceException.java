package by.tc.task01.service.exception;

/**
 * Exceptions that can be thrown on service layer
 */
public class ServiceException extends Exception {
    public ServiceException(Exception e) {
        super(e);
    }
}
