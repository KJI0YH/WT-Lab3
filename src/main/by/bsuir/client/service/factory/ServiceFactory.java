package main.by.bsuir.client.service.factory;

import main.by.bsuir.client.service.StudentService;
import main.by.bsuir.client.service.UserService;
import main.by.bsuir.client.service.impl.StudentServiceImlp;
import main.by.bsuir.client.service.impl.UserServiceImlp;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImlp();
    private final StudentService studentService = new StudentServiceImlp();

    private ServiceFactory(){};

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService(){
        return userService;
    }

    public StudentService getStudentService(){
        return studentService;
    }
}
