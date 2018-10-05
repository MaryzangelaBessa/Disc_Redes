package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    private int port = 5000;
    private String id = "localhost";
    private Socket client;
    DataOutputStream send;
    DataInputStream receive;

    public TCPClient(){
        try {
            client = new Socket(id, port);
            send = new DataOutputStream(client.getOutputStream());
            receive = new DataInputStream(client.getInputStream());
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void sendRequest(String mensager){
        try{
            send.writeUTF(mensager);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public String getResponse(){
        String result = null;
        try{
            result = receive.readUTF();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void close(){
        try {
            this.client.close();
        }
        catch (IOException e){
            System.out.println("close:"+e.getMessage());
        }
    }
}
