package spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 간단한 8080 웹서버 생성
public class WebServer2 {
    public static void main(String[] args) {
        try {
            // socket: 통신의 창구
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
            while (true){
                // 자바에 내장되어 있는 통신 라이브러리
                // Socket 객체는 사용자의 client 객체
                try(Socket socket = serverSocket.accept()){
                    // Http Response Header
                    // text/plain: 문자열
                    // text/html: html
                    String httpResponse = "HTTP/1.1 200 OK\r\nContent-Type: text/html; charset=UTF-8\r\n\r\n"
                            // Http Response Body
                            + "<html><body><h1>Hello World</h1><p>안녕하세요</p></body></html>";
                    socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
