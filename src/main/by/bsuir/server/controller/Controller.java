package main.by.bsuir.server.controller;

import main.by.bsuir.server.controller.command.Command;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    private final char delimiter = ' ';

    public String executeTask(String request){
        String commandName = request;
        Command command;

        if (request.indexOf(delimiter) != -1)
            commandName = request.substring(0, request.indexOf(delimiter));
        command = provider.getCommand(commandName);

        return command.execute(request);
    }
}
