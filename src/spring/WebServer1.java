package spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 간단한 8080 웹서버 생성
public class WebServer1 {
    public static void main(String[] args) {
        try {
            // socket: 통신의 창구
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
            while (true){
                // 자바에 내장되어 있는 통신 라이브러리
                try(Socket socket = serverSocket.accept()){
                    String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World";
                    socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
