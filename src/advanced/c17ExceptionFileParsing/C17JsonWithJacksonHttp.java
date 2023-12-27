package advanced.c17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C17JsonWithJacksonHttp {
    public static void main(String[] args) {
        // http 클라이언트 생성
        // 실무적으로 많이 활용
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        // http 요청 객체 생성
        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        // http 응답 객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String postData = response.body();
            JsonNode jsonNode = mapper.readTree(postData);
//            Post post = new Post(jsonNode.get("id").asLong(), jsonNode.get("title").asText(),
//                    jsonNode.get("body").asText(), jsonNode.get("userId").asLong());

            // readValue를 사용해서 객체로 곧바로 매핑 (기본 생성자가 있으면 가능)
//            Post post2 = mapper.readValue(postData, Post.class);
//            System.out.println(post2);

            // JsonNode는 트리구조 이므로,
            // for (JsonNode node : jsonNode)로 멀티 데이터들을 순회 처리 가능
            List<Post> postList = new ArrayList<>();
//            for (JsonNode node : jsonNode){
//                postList.add(new Post(node.get("id").asLong(), node.get("title").asText(),
//                        node.get("body").asText(), node.get("userId").asLong()));
//                System.out.println("\n");
//            }
            for (JsonNode jNode : jsonNode){
                postList.add(mapper.readValue(jNode.toString(), Post.class));
            }
            System.out.println(postList);

            // java객체를 Json 데이터로 직렬화
            String serializedData = mapper.writeValueAsString(postList);
            System.out.println(serializedData);
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Post {
    private Long id;
    private String title;
    private String body;
    private Long userId;

    Post(Long id, String title, String body, Long userId){
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    Post(){}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public String toString(){
        return "id: " + id + "\n" + "title: " + title + "\n" + "body: " + body + "\n" + "userId: " + userId + "\n";
    }
}
