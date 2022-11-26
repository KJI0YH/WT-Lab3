package main.by.bsuir.client.dao;

import main.by.bsuir.client.bean.Student;
import main.by.bsuir.client.dao.exception.DAOException;

public interface StudentDAO  {
    void addStudent(Student student) throws DAOException;
    void deleteStudent(Student student) throws DAOException;
}
