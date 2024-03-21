package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public MyServer() {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(10000); // 서버의 포트 번호
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String request = br.readLine();

            if (request.equals("get")) {
                System.out.println("달라고?");
            } else if (request.equals("post")) {
                System.out.println("준다고?");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new MyServer();
    }
}
