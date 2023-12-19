package advanced.class_method_recur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. 합계가 6이상인 2개 순열만 add (완료)
 * 2. 합계가 6이상 모든 순열 add -> temp.size 사용 가능 / 변수값 지정 (완료)
 * 3. 모든 순열에서 합계가 가장 큰 값 찾기 -> static 변수 지정
 * 4. 3개 순열에서 합계가 가장 큰 값 (temp List 사용 x)
 */
public class C12PermutationPractice {
    static int max = 0;
    static int sum = 0;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[myList.size()];
//        permutationQ1(visited, myList, permutations, temp, 2);
//        System.out.println("합계가 6이상인 2개 순열: " + permutations);
//        permutationQ2(visited, myList, permutations, temp);
//        System.out.println("합계가 6이상인 모든 순열: " + permutations);
//        permutationQ3(visited, myList, permutations, temp);
//        System.out.println("모든 순열에서 합계가 가장 큰 값: " + max);
        permutationQ4(visited, myList, 3, 0);
        System.out.println("3개 순열에서 합계가 가장 큰 값: " + max);
    }

    public static void permutationQ1(boolean[] visited, List<Integer> myList, List<List<Integer>> permutations, List<Integer> temp, int n){

        if (temp.size() == n){
            int sum = 0;
            for (Integer number : temp){
                sum += number;
            }
            if (sum >= 6){
                permutations.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = 0; i < myList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(myList.get(i));
                permutationQ1(visited, myList, permutations, temp, n);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void permutationQ2(boolean[] visited, List<Integer> myList, List<List<Integer>> permutations, List<Integer> temp){
        int sum = 0;
        for (Integer number : temp){
            sum += number;
        }
        if (sum >= 6){
            permutations.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < myList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(myList.get(i));
                permutationQ2(visited, myList, permutations, temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void permutationQ3(boolean[] visited, List<Integer> myList, List<List<Integer>> permutations, List<Integer> temp){

        int sum = 0;
        for (Integer number : temp){
            sum += number;
        }
        if (sum > max){
            max = sum;
        }

        for (int i = 0; i < myList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(myList.get(i));
                permutationQ3(visited, myList, permutations, temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void permutationQ4(boolean[] visited, List<Integer> myList, int count, int n){
        if (sum > max){
            max = sum;
        }
        if (n == count){
            return;
        }

        for (int i = 0; i < myList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                sum += myList.get(i);
                permutationQ4(visited, myList, count, n + 1);
                sum -= myList.get(i);
                visited[i] = false;
            }
        }
    }
}
