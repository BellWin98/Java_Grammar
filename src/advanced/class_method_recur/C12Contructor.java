package advanced.class_method_recur;

public class C12Contructor {
    public static void main(String[] args) {
        Calendar calendar1 = new Calendar();
        Calendar calendar2 = new Calendar("2023년", "3월", "24일");
        Calendar calendar3 = new Calendar("2023년", "3월");
        Calendar calendar4 = new Calendar("2023년");
        System.out.println(calendar1.getYear() + " " + calendar1.getMonth() + " " + calendar1.getDay());
        System.out.println(calendar2.getYear() + " " + calendar2.getMonth() + " " + calendar2.getDay());
        System.out.println(calendar3.getYear() + " " + calendar3.getMonth() + " " + calendar3.getDay());
    }
}

class Calendar {
    private String year;
    private String month;
    private String day;

    Calendar(){}

    Calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 메서드 오버로딩을 통해 같은 이름의 생성자 생성 가능
    Calendar(String year, String month){
        this.year = year;
        this.month = month;
    }

    Calendar(String year){
        // this() 키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출
        this(year, null, null);
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}
