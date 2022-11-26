package main.by.bsuir.client.service;

import main.by.bsuir.client.bean.User;
import main.by.bsuir.client.service.exception.ServiceException;

public interface UserService {
    void auth (String login, String password) throws ServiceException;
    void quit (String login) throws ServiceException;
    void registration(User user) throws ServiceException;
}
