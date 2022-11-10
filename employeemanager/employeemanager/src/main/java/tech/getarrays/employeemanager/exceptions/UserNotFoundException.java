package tech.getarrays.employeemanager.exceptions;

import org.apache.catalina.User;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
