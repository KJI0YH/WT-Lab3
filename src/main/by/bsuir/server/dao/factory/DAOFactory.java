package main.by.bsuir.client.dao.factory;

import main.by.bsuir.client.dao.StudentDAO;
import main.by.bsuir.client.dao.UserDAO;
import main.by.bsuir.client.dao.impl.XMLStudentDAO;
import main.by.bsuir.client.dao.impl.XMLUserDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final UserDAO xmlUserImpl = new XMLUserDAO();
    private final StudentDAO xmlStudentImpl = new XMLStudentDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public UserDAO getUserDAO(){
        return xmlUserImpl;
    }

    public StudentDAO getStudentDAO(){
        return xmlStudentImpl;
    }
}
