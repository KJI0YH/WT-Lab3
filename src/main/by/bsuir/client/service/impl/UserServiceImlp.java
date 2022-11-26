package main.by.bsuir.client.service.impl;

import main.by.bsuir.client.bean.User;
import main.by.bsuir.client.dao.exception.DAOException;
import main.by.bsuir.client.dao.factory.DAOFactory;
import main.by.bsuir.client.dao.UserDAO;
import main.by.bsuir.client.service.UserService;
import main.by.bsuir.client.service.exception.ServiceException;

public class UserServiceImlp implements UserService {

    @Override
    public void auth(String login, String password) throws ServiceException {
        // check parameters

        // realize functionality user login in system
        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();

        try{
            userDAO.singIn(login, password);
        } catch (DAOException e ){

        }

    }

    @Override
    public void quit(String login) throws ServiceException{

    }

    @Override
    public void registration(User user) throws ServiceException{

    }
}
