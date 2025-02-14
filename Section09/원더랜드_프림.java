package 인프런.Section09;

import java.util.*;

class Edge_8 implements Comparable<Edge_8> {
    int vex, cost;
    public Edge_8 (int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge_8 o) {
        return this.cost - o.cost;
    }
}

public class 원더랜드_프림 {

    static int v;
    static boolean[] visited;

    public int solution(ArrayList<ArrayList<Edge_8>> graph) {
        int answer = 0;

        PriorityQueue<Edge_8> q = new PriorityQueue<>();
        q.offer(new Edge_8(1, 0));

        while(!q.isEmpty()) {
            Edge_8 tmp = q.poll();
            int ev = tmp.vex;
            if(!visited[ev]) {
                visited[ev] = true;
                answer += tmp.cost;
                for(Edge_8 ob : graph.get(ev)){
                    if(!visited[ob.vex]) q.offer(new Edge_8(ob.vex, ob.cost));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        원더랜드_프림 t = new 원더랜드_프림();

        v = scanner.nextInt();
        int e = scanner.nextInt();
        visited = new boolean[v+1];
        Arrays.fill(visited, false);
        ArrayList<ArrayList<Edge_8>> graph = new ArrayList<>();
        for(int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 1; i <= e; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            graph.get(v1).add(new Edge_8(v2, cost));
            graph.get(v2).add(new Edge_8(v1, cost));
        }

        System.out.print(t.solution(graph));

    }
}
