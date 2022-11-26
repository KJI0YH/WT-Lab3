package main.by.bsuir.client;

import main.by.bsuir.client.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try{
            Socket socket = new Socket(InetAddress.getLocalHost(), 80);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String request;
            Controller controller = new Controller();
            while ((request = reader.readLine()) != null){
                String response = controller.executeTask(request);
                System.out.println(response);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
