package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static String getRequest(Socket client){
        DataInputStream receive;
        String result = null;
        try{
            receive = new DataInputStream(client.getInputStream());
            result=receive.readUTF();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    public static void sendResponse(String mensager, Socket client) {
        DataOutputStream send;

        try{
            send = new DataOutputStream(client.getOutputStream());
            send.writeUTF(mensager);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        ServerSocket server;

        try {

            server = new ServerSocket(5000);
            Despachante despachante = new Despachante();
            Socket client = server.accept();

            while (true) {

                String data = getRequest(client);
                System.out.println(data);          //mostra o dado passado pelo cliente
                String result = despachante.invoke(data);
                sendResponse(result, client);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
