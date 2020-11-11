package ru.geekbrains.lesson10;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(9090)) {
            Socket accept = server.accept();
            try (DataInputStream input = new DataInputStream(accept.getInputStream())) {
                String message = "";
                while (!message.equals("/exit")) {
                    message = input.readUTF();
                    System.out.println(message);
                }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
