package main.by.bsuir.client.service;

import main.by.bsuir.client.bean.Student;
import main.by.bsuir.client.service.exception.ServiceException;

public interface StudentService {
    void addStudent(Student student) throws ServiceException;
    void deleteStudent(Student student) throws ServiceException;

}
