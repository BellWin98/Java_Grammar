import java.util.Arrays;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
        // 참조 자료형: 기본 자료형을 제외한 모든 자료형
        // Wrapper 클래스: 기본형 타입에 없는 다양한 기능을 지원
        // int와 Integer 간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // 오토 언박싱: Integer -> int로 자동 형변환
//        int c = b;
//        // 언박싱 (수동): Integer -> int
//        int d = b.intValue();
//        // 오토 박싱
//        Integer e = a;
//        // 박싱
//        Integer f = Integer.valueOf(a);

        // String과 int의 형변환
//        int a = 10;
//        String str_a = Integer.toString(a); // "10"
//        String str_b = String.valueOf(a);
//        int c = Integer.parseInt(str_a); // 10

        // 참조 자료형에 원시 자료형을 담을 땐 Wrapper 클래스를 써야함
        // ex. 컬렉션 프레임 워크 (List, Set, Map)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);

        // String pool, String 객체
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        String str3 = "hello";
//        String str4 = "hello";
//        String str5 = str1; // 같은 주소를 바라봄
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str3 == str4);
//        System.out.println(str1 == str5);

        // 문자열의 길이: length();, 공백도 문자열로 카운트
//        String myStr = "hello";
//        System.out.println(myStr.length());
//
//        // indexOf: 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String myStr2 = "hello java";
//        System.out.println(myStr2.indexOf("java"));
//
//        // contains: 특정 문자열의 존재 여부를 boolean으로 리턴
//        String myStr3 = "hello java";
//        System.out.println(myStr3.contains("hello"));

        // charAt: 특정 위치(index)의 문자(char)를 리턴
        // a의 개수 구하기
//        String str = "abcdefabaadf";
//        int aCount = 0;
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == 'a'){
//                aCount++;
//            }
//        }
//        System.out.println(aCount);

        // substring(a, b): a이상 b 미만의 index를 자른다.
//        String str1 = "hello world";
//        System.out.println(str1.substring(0, 5));
//        System.out.println(str1.substring(6, str1.length()));

        // trim, strip
//        String trimStr = "     hello world  ";
//        trimStr = trimStr.strip();
//        System.out.println(trimStr);

        // toUpperCase(), toLowerCase()
//        String str = "HeLlO wOrLd";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());

        // 문자열 더하기
        // +=은 성능이 떨어진다.
        // 이유: 갖다 붙인 게 아니라 새롭게 데이터를 선언(재선언)한 것이기 때문에 느림
        // StringBuffer나 StringBuilder 사용하면 좋음
        // 성능 관계: String < StringBuffer < StringBuilder

//        String a = "hello";
//        a += " world";
//        System.out.println(a);

        // char -> String 형변환
//        char ch1 = 'a';
//        String str1 = Character.toString(ch1);
//        System.out.println(str1);

        // 알파벳만 빼고 문자를 str2에 새롭게 담기
//        String str = "01234asdfrfr한글히히히히1234";
//        String str2 = "";
//
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                continue;
//            }
//            str2 += str.charAt(i);
//        }
//        System.out.println(str2);


        // replace(a, b): a 문자열을 b 문자열로 바꿈
        ////        String str1 = "hello world";
        ////        String str2 = str1.replace("world", "java");
        ////        System.out.println(str2);
        //
        // replaceAll: replace와 동일한 기능, 다만 정규표현식을 사용할 수 있음
//        String str1 = "hello world";
//        String str2 = str1.replaceAll("world", "python");
//        System.out.println(str2);
        // [a-z], [A-Z], [가-힣], [0-9]
//        String str1 = "01234asdfrfr한글히히히히1234";
//        String str2 = str1.replaceAll("[a-zA-Z가-힣0-9]", "");
//        System.out.println(str2);

        // Pattern 클래스
        // .*: Optional (뭐든 나와도 됨)
//        boolean matcher = Pattern.matches(".*[a-z]+.*", "한글hello한worl글dASDf헤");
//        System.out.println(matcher);

        // 전화번호 검증
        // \\d: 숫자, {}: 연속으로 나오는 숫자
//        boolean matcher2 = Pattern.matches("^01\\d{1}-\\d{4}-\\d{4}$", "010-1234-1234");
//        System.out.println(matcher2);

        // 이메일 검증
        // \\d: 숫자, {}: 연속으로 나오는 숫자
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello@naver.com");
//        System.out.println(matcher3);

        // split
//        String a = "a:b:c:d";
//        String[] strArr = a.split(":");
//        System.out.println(Arrays.toString(strArr));
//        String b = "a  b c d";
//        String[] str2Arr = b.split("\\s+"); // 여러 개의 공백 제거
//        System.out.println(Arrays.toString(str2Arr));

        // isEmpty와 null 구분
//        String str1 = null;
//        String str2 = "";
//
//        System.out.println(str1 == null);
//        System.out.println(str2 == null);
//        System.out.println(str2.isEmpty());
//        System.out.println(str1.isEmpty()); // NPE (NullPointerException) 예외 발생
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";

        // join: String[] -> String
        // 합치는 기준이 있어야 함.
//        String[] strArr = {"C", "C++", "Java", "Python", "Html"};
//        String str = String.join(" ", strArr);
//        System.out.println(str);

        // StringBuffer
//        StringBuffer sb = new StringBuffer("hello");
//        sb.append(" world");
//        sb.insert(6, "java ");
//        System.out.println(sb);
//        System.out.println(sb.substring(6, 10));
//        System.out.println(sb.delete(1, 3));
//        System.out.println(sb);
//        System.out.println(sb);

        // 성능: String < StringBuffer < StringBuilder (Thread-Safe X)
//        StringBuilder sb2 = new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);

//        System.out.println(('a'+"") + 3);
    }
}
