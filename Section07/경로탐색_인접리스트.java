package 인프런.Section07;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int nv : graph.get(v)) {
                if(check[nv] == 0) {
                    check[nv] = 1;
                    DFS(nv);
                    check[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        경로탐색_인접리스트 t = new 경로탐색_인접리스트();

        n = scanner.nextInt();
        m = scanner.nextInt();

        graph = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        check = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        t.DFS(1);
        System.out.print(answer);
    }
}
