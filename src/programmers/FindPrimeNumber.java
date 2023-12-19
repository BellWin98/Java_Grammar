package programmers;

import java.util.*;

public class FindPrimeNumber {
    public static void main(String[] args) {
        String numbers = "17";
        String[] numberSplit = numbers.split("");
        List<Integer> numberList = new ArrayList<>();
        Set<List<Integer>> permutations = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        for (String str : numberSplit){
            numberList.add(Integer.parseInt(str));
        }

        boolean[] visited = new boolean[numberList.size()];

        permutation(permutations, visited, numberList, temp, 0);

        System.out.println("numberList: " + numberList);
        System.out.println("permutations: " + permutations);
//        System.out.println("visited: " + Arrays.toString(visited));
        System.out.println(permutations.size());
    }

    public static void permutation(Set<List<Integer>> permutations, boolean[] visited, List<Integer> numberList, List<Integer> temp, int n){
        if (n > 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.size(); i++){
                sb.append(temp.get(i));
            }
            if (!sb.toString().equals("1") && sb.indexOf("0") != 0){
                int number = Integer.parseInt(sb.toString());
                int count = 1;
                // 소수 판별
                for (int i = 2; i * i <= number; i++){
                    if (number % i == 0){
                        count++;
                    }
                }
                if (count == 1){
                    permutations.add(new ArrayList<>(temp));
                }
            }
        }
        for (int i = 0; i < numberList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(numberList.get(i));
                permutation(permutations, visited, numberList, temp, n + 1);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
