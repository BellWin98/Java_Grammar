package advanced.c16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
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

        // 임의로 특정 시간을 만들어 내고 싶을 때: of 메서드 사용
        LocalDate birthDay = LocalDate.of(1998, 3, 24);
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());

        LocalTime birthTime = LocalTime.of(14, 2, 19);
        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);

        // Chrono Field : Enum 타입 사용
        // 사용 이유: 매개변수화 시킬 수 있음. 매개변수로 크로노 필드를 받아 프로그램의 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));

        // 0: 오전, 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));

        // 현재 시간은 오전 / 오후 입니다.
        String str = LocalDateTime.now().get(ChronoField.AMPM_OF_DAY) == 0 ? "오전" : "오후";
        System.out.println("현재 시간은 " + str + "입니다.");
    }
}
