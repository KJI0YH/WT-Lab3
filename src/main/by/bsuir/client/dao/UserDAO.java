package main.by.bsuir.client.dao;

import main.by.bsuir.client.bean.User;
import main.by.bsuir.client.dao.exception.DAOException;

public interface UserDAO {
    void singIn (String login, String password) throws DAOException;
    void registration (User user) throws DAOException;
}
