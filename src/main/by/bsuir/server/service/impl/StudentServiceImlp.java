package main.by.bsuir.server.service.impl;

import main.by.bsuir.server.bean.Student;
import main.by.bsuir.server.dao.StudentDAO;
import main.by.bsuir.server.dao.UserDAO;
import main.by.bsuir.server.dao.exception.DAOException;
import main.by.bsuir.server.dao.factory.DAOFactory;
import main.by.bsuir.server.service.StudentService;
import main.by.bsuir.server.service.exception.ServiceException;

import java.util.Objects;

public class StudentServiceImlp implements StudentService {
    @Override
    public void addStudent(Student student) throws ServiceException {
        //check parameters
        if (student.getFirstName() == null ||  Objects.equals(student.getFirstName(), ""))
            throw new ServiceException("Student first name is empty");
        if (student.getLastName() == null || Objects.equals(student.getLastName(), ""))
            throw new ServiceException("Student last name is empty");

        StudentDAO studentDAO = DAOFactory.getInstance().getStudentDAO();
        try{
            studentDAO.addStudent(student);
        } catch (DAOException e){
            throw new ServiceException("Can not add student");
        }
    }

    @Override
    public void deleteStudent(Student student) throws ServiceException{
        //check parameters
        if (student.getFirstName() == null ||  Objects.equals(student.getFirstName(), ""))
            throw new ServiceException("Student first name is empty");
        if (student.getLastName() == null || Objects.equals(student.getLastName(), ""))
            throw new ServiceException("Student last name is empty");

        StudentDAO studentDAO = DAOFactory.getInstance().getStudentDAO();
        try{
            studentDAO.deleteStudent(student);
        } catch (DAOException e){
            throw new ServiceException("Can not delete student");
        }
    }

    @Override
    public String viewStudents() throws ServiceException{
        String view = null;
        StudentDAO studentDAO = DAOFactory.getInstance().getStudentDAO();
        try {
            view = studentDAO.viewStudents();
        } catch (DAOException e){
            throw new ServiceException("Can not view students");
        }
        return view;
    }
}
