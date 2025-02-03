package 인프런.Section07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리_BFS {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);

        while(!q.isEmpty()) {
            int cv = q.poll();
            for(int nv : graph.get(cv)) {
                if(ch[nv] == 0) { //방문 유무
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        그래프_최단거리_BFS t = new 그래프_최단거리_BFS();

        n = scanner.nextInt();
        m = scanner.nextInt();

        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++ ){
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1];
        dis = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        t.BFS(1);

        for(int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
