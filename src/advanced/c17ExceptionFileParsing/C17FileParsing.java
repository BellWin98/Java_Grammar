package advanced.c17ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

// text파일 parsing
public class C17FileParsing {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/advanced/c17ExceptionFileParsing/text_file.txt");

        // nio 패키지에는 버퍼 기능 및 non-blocking 방식이 구현되어 있다.
        // 기본 설정은 StandardCharsets.UTF_8
        // StandardOpenOption의 append는 추가, write는 덮어쓰기 기능
        // CREATE_NEW 이후에 APPEND 실행 가능
        // 파일 시스템에 저장되는 거라 메모리가 날아가지 않음
        // 파일 쓰기
        try {
            if (Files.exists(filePath)){
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 파일 읽기: readString, readAllLines(List 형태)
        try {
//            String myString = Files.readString(filePath);
//            System.out.println(myString);
            // readAllLines을 가지고 for문 돌려 출력
            List<String> myStrings = Files.readAllLines(filePath);
            for (String str : myStrings){
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
