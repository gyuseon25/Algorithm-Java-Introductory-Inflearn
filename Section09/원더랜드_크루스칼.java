package 인프런.Section09;

import java.util.*;

class Edge_7 implements Comparable<Edge_7> {
    int a, b, c;

    public Edge_7(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Edge_7 o) {
        return this.c - o.c;
    }
}

public class 원더랜드_크루스칼 {

    static int[] parent;
    static int v;

    public int find(int v) {
        if(parent[v] == v) return v;
        else return parent[v] = find(parent[v]);
    }

    public void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) parent[fa] = fb;
    }

    public int solution(ArrayList<Edge_7> arr) {
        int answer = 0;
        int cnt = 0;

        while(cnt != v-1) {
            for(Edge_7 e : arr) {
                int fa = find(e.a);
                int fb = find(e.b);
                if(fa != fb) {
                    union(e.a, e.b);
                    answer += e.c;
                    cnt++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        원더랜드_크루스칼 t = new 원더랜드_크루스칼();

        v = scanner.nextInt();
        int e = scanner.nextInt();
        parent = new int[v+1];
        for(int i = 1; i <= v; i++) {
            parent[i] = i;
        }
        ArrayList<Edge_7> arr = new ArrayList<>();

        for(int i = 1; i <= e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            arr.add(new Edge_7(a, b, c));
        }
        Collections.sort(arr);

        System.out.print(t.solution(arr));
    }
}
