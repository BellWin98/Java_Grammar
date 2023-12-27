package advanced.c17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C17JsonWithJacksonRaw {
    public static void main(String[] args) {
        // Jackson 라이브러리의 핵심 클래스: ObjectMapper
        // json을 parsing함
        ObjectMapper mapper = new ObjectMapper();
        try {
            // 데이터가 map형태로 되어 있지만, map은 아니다.
            // readTree를 통해 json을 계층적 트리 구조 형태로 변환
            File myPath = Paths.get("src/advanced/c17ExceptionFileParsing/test-data1.json").toFile();
            JsonNode node = mapper.readTree(myPath);
            Map<String, String> studentMap = new HashMap<>();
            studentMap.put("id", node.get("id").asText());
            studentMap.put("name", node.get("name").asText());
            studentMap.put("classNumber", node.get("classNumber").asText());
            studentMap.put("city", node.get("city").asText());
//            System.out.println(studentMap);

            // key: value 중에 value의 타입이 예상되지 않을 때는 Object 타입으로도 받을 수 있다.
            Map<String, Object> studentMap2 = mapper.readValue(myPath, Map.class);
            System.out.println(studentMap2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
