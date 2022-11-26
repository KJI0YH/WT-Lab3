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
