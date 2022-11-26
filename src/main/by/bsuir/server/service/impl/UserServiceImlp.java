package main.by.bsuir.server.service.impl;

import main.by.bsuir.server.bean.User;
import main.by.bsuir.server.dao.exception.DAOException;
import main.by.bsuir.server.dao.factory.DAOFactory;
import main.by.bsuir.server.dao.UserDAO;
import main.by.bsuir.server.service.UserService;
import main.by.bsuir.server.service.exception.ServiceException;

public class UserServiceImlp implements UserService {

    @Override
    public void auth(String login, String password) throws ServiceException {
        // check parameters
        if (login == null || login.equals(" "))
            throw new ServiceException();
        if (password == null || password.length() < 8)
            throw new ServiceException();

        // realize functionality user login in system
        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();

        try{
            userDAO.auth(login, password);
        } catch (DAOException e ){
            throw new ServiceException();
        }
    }

    @Override
    public void quit(String login) throws ServiceException{
        if (login == null || login.equals(" "))
            throw new ServiceException();
        UserDAO userDAO = DAOFactory.getInstance().getUserDAO();
        try {
            userDAO.quit();
        } catch (DAOException e){
            throw new ServiceException();
        }
    }

    @Override
    public void registration(User user) throws ServiceException{
        //todo check rights
        UserDAO userDAO = DAOFactory.getInstance().getUserDAO();
        try {
            userDAO.createUser(user);
        } catch (DAOException e){
            throw new ServiceException();
        }
    }
}
