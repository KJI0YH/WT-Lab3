package main.by.bsuir.server.controller.command.impl;

import main.by.bsuir.server.bean.Student;
import main.by.bsuir.server.controller.Controller;
import main.by.bsuir.server.controller.command.Command;
import main.by.bsuir.server.controller.exception.ControllerException;
import main.by.bsuir.server.service.exception.ServiceException;
import main.by.bsuir.server.service.factory.ServiceFactory;

public class Add implements Command {
    @Override
    public String execute(String request) throws ControllerException {
        String[] arguments = request.split(Controller.getDelimiter());
        if (arguments.length != 3)
            throw new ControllerException("Add command should contains 2 arguments");
        try{
            ServiceFactory.getInstance().getStudentService().addStudent(new Student(arguments[1], arguments[2]));
        } catch (ServiceException e){
            throw new ControllerException("Can not add a student");
        }
        return "ADD student success";
    }
}
