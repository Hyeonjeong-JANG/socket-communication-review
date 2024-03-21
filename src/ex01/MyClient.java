package ex01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClient {
    public MyClient() {
        try {
            Socket socket = new Socket("localhost", 10000); // 클라이언트의 주소는 로컬호스트, 그런데 내가 서버의 10000번이랑 통신하겠다.
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("get\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new MyClient();
    }
}
