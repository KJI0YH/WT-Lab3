package main.by.bsuir.server.dao.impl;

import main.by.bsuir.server.bean.User;
import main.by.bsuir.server.dao.UserDAO;
import main.by.bsuir.server.dao.exception.DAOException;

public class XMLUserDAO implements UserDAO {
    @Override
    public User auth(String login, String password) throws DAOException {
        return null;
    }

    @Override
    public void createUser(User user) throws DAOException {

    }

    @Override
    public void quit(User user) throws DAOException {
    }
}
