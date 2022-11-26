package main.by.bsuir.server.dao;

import main.by.bsuir.server.bean.User;
import main.by.bsuir.server.dao.exception.DAOException;

public interface UserDAO {
    void singIn (String login, String password) throws DAOException;
    void registration (User user) throws DAOException;
}
