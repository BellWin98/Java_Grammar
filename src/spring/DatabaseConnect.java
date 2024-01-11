package spring;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) {
        // DB의 URL: localhost:3306
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String pw = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, pw);
            System.out.println("DB Connection Success");

                // statement: 쿼리를 담아 DB에 보낼 수 있는 객체
                Statement st = conn.createStatement();
                String myQuery = "select * from author";

                // ResultSet: 쿼리 결과 데이터 집합
                ResultSet rs = st.executeQuery(myQuery);
                while (rs.next()){ // rs 포인터 (Cursor)로 next가 없을 때까지 순회
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println("id : " + id + ", name : " + name);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
