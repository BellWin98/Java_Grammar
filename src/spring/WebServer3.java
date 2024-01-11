package spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 간단한 8081 웹서버 생성
public class WebServer3 {

//                [header]
//                POST / HTTP/1.1
//                Host: localhost:8081
//                Content-Type: application/x-www-form-urlencoded // form 태그 쓰면 이 형식
//                Content-Length: xx

//                [body]
//                userInput=hello world
    public static void main(String[] args) {
        try {
            // socket: 통신의 창구
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
            while (true){
                // 자바에 내장되어 있는 통신 라이브러리
                try(Socket socket = serverSocket.accept()){
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    // readLine: 띄어쓰기로 구분하여 읽기 (두 줄 나오면 종료)
                    while (!(line = br.readLine()).isBlank()){ // br이 비어있지 않으면
                        sb.append(line + "\n");
                    }
                    if (sb.toString().contains("POST")){
                        char[] buffer = new char[1024]; // buffer에 요청에 대한 body 담음
                        br.read(buffer);
                        // body만 출력
                        System.out.println("POST body data: " + new String(buffer));
                        // header만 출력
                        System.out.println("POST header data: " + sb);
                    }
                    String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "OK";
                    socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
