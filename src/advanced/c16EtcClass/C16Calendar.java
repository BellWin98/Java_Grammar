package advanced.c16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class C16Calendar {
    public static void main(String[] args) {
        // 날짜 관련 클래스의 종류: Calendar(java.util), java.time 페키지 안에 있는 Local ~ 클래스
        // 결론은 LocalDateTime 쓰면 됨
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//
//        // 특정한 숫자값은 get함수의 input 값으로 주어 원하는 날짜 정보를 출력할 수 있게 해줌
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH) + 1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH)); // 일자
//        System.out.println(time.get(Calendar.DAY_OF_WEEK)); // 요일
//        System.out.println(time.get(Calendar.HOUR_OF_DAY));
//        System.out.println(time.get(Calendar.MINUTE));
//        System.out.println(time.get(Calendar.SECOND));

        // java.time 패키지: Local ~ 클래스
        LocalTime presentTime = LocalTime.now();
        System.out.println(presentTime);

        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate);

        LocalDateTime present = LocalDateTime.now();
        System.out.println(present.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
