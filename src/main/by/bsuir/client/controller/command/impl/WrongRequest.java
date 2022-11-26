package main.by.bsuir.client.controller.command.impl;

import main.by.bsuir.client.controller.command.Command;

public class WrongRequest implements Command {
    @Override
    public String execute(String request) {
        return "Wrong request";
    }
}
