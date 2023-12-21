package advanced.c12class_method_recur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12RecurCombiPermu {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[myList.size()];
        nCombination(0, temp, myList, combinations, 3);
        nPermutation(visited, temp, myList, permutations, 3);
        System.out.println("조합: " + combinations);
        System.out.println("순열: " + permutations);




//        for (int i = 0; i <myList.size() - 1; i++){
//            for (int j = i + 1; j < myList.size(); j++){
//                combinations.add(Arrays.asList(myList.get(i), myList.get(j)));
//            }
//        }

//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++){
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++){
//                temp.add(myList.get(j));
//                // combinations.add(temp)하면 combinations에 temp의 주소값으로 동기화되므로, temp.remove()하면 combinations도 같이 삭제됨
//                combinations.add(new ArrayList<>(temp));
//                // 더해주고 빼주는 구조.
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(combinations);


//        for (int i = 0; i < myList.size() - 1; i++){
//            temp.add(myList.get(i));
//            nCombination(temp, myList, combinations, i, n);
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(combinations);
//
//        for (int i = 0; i < myList.size() - 1; i++){
//            for (int j = 0; j < myList.size(); j++){
//                if (i == j){
//                    continue;
//                }
//                permutations.add(Arrays.asList(myList.get(i), myList.get(j)));
//            }
//        }
//        System.out.println(permutations);

    }

    public static void nCombination(int start, List<Integer> temp, List<Integer> myList, List<List<Integer>> combinations, int n){
        if (temp.size() == n){
            combinations.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++){
            temp.add(myList.get(i));
            nCombination(i + 1, temp, myList, combinations, n);
            temp.remove(temp.size() - 1);
        }
    }

    public static void nPermutation(boolean[] visited, List<Integer> temp, List<Integer> myList, List<List<Integer>> permutations, int n){
        if(temp.size() == n){
            permutations.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(myList.get(i));
                nPermutation(visited, temp, myList, permutations, n);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
