package 인프런.Section07;

import java.util.Scanner;

public class 경로탐색_인접행렬 {

    static int[][] graph;
    static int n, m, answer = 0;
    static int[] check;

    public void DFS(int v) {
        if(v == n) answer++;
        else {
            for(int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0; //백트래킹 할때 check 한 거 다시 풀기
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        경로탐색_인접행렬 t = new 경로탐색_인접행렬();

        n = scanner.nextInt();
        m = scanner.nextInt();

        graph = new int[n+1][n+1];
        check = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            t.graph[a][b] = 1;
        }
        check[1] = 1;
        t.DFS(1);
        System.out.print(answer);
    }
}
