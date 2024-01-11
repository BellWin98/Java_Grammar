import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int budget = 9;
        int[] d = {1,3,2,5,4};
        int answer=0;
        int sum=0;
        Arrays.sort(d);
        for(int i : d){
            sum += i;
            if(sum <= budget){
                answer+=1;
            }
            else {
                break;
            }
        }
        System.out.println(answer);
    }

}
