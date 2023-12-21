package advanced.c12class_method_recur;

// 프로그래머스 - 피로도
public class Pirodo {
    static int max = 0;
    static boolean checked = false;
    public static void main(String[] args) {
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        boolean[] visited = new boolean[dungeons.length];
        int k = 80;
        permutation(visited, dungeons, k, 0);
        System.out.println(max);
    }

    public static void permutation(boolean[] visited, int[][] dungeons, int k, int count){
        if (count > max){
            max = count;
        }

        if (max == dungeons.length){
            checked = true;
            return;
        }

        for (int i = 0; i < dungeons.length; i++){
            if (!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                permutation(visited, dungeons, k - dungeons[i][1], count + 1);
                visited[i] = false;
            }
            if (checked){
                break;
            }
        }
    }
}
