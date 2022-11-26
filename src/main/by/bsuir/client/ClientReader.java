package main.by.bsuir.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientReader extends Thread{
    private final Client client;
    public ClientReader(Client client){
        this.client = client;
    }

    public void run(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (client.isRunning()){
                String request = reader.readLine();
                client.getSocketWriter().println(request);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
