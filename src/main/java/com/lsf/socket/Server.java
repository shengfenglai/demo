package com.lsf.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(6666);
            while (true) {
                Socket socket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                System.out.println(dis.readUTF());
                dis.close();
                socket.close();
            }

        } catch (IOException e) {
            System.out.println("IoException");
            e.printStackTrace();
        }

    }

}
