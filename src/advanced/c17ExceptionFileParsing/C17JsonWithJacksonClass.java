package advanced.c17ExceptionFileParsing;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C17JsonWithJacksonClass {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File myPath = Paths.get("src/advanced/c17ExceptionFileParsing/test-data2.json").toFile();
        List<Student> students = new ArrayList<>();
        try {
            JsonNode nodeData = mapper.readTree(myPath);
            JsonNode studentNode = nodeData.get("students");
            for (JsonNode node : studentNode){
                students.add(mapper.readValue(node.toString(), Student.class));
            }
            for (Student student : students){
                System.out.println(student.getId());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Student{
    private Long id;
    private String name;
    private String classNumber;
    private String city;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }
}
