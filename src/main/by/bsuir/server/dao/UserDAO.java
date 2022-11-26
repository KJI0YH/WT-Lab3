package main.by.bsuir.server.dao;

import main.by.bsuir.server.bean.User;
import main.by.bsuir.server.dao.exception.DAOException;

public interface UserDAO {
    void auth (String login, String password) throws DAOException;
    void createUser (User user) throws DAOException;
    void quit() throws DAOException;
}
