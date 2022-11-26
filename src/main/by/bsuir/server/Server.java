package main.by.bsuir.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  extends Thread {
    public static final int PORT = 5555;
    private static final int BACKLOG = 50;
    private ServerSocket serverSocket;

    @Override
    public void run(){
        try{
            serverSocket = new ServerSocket(PORT, BACKLOG);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Server is running");

        while (true){
            Socket clientSocket;
            try {
                clientSocket = serverSocket.accept();
                System.out.println("Client connected");

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
