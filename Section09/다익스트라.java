package 인프런.Section09;

import java.util.*;

class Node {
    int start, end;

    public Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class 다익스트라 {

    static int n;
    static int[] answer;
    static int[][] arr;

    public void BFS(int start) {
        Queue<Node> q = new LinkedList<>();
        for(int i  = 2; i <= n; i++) {
            if(arr[start][i] != 0) {
                q.offer(new Node(start, i));
                answer[i] = arr[start][i];
            }
        }
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Node tmp = q.poll();
                for(int j = 2; j <= n; j++) {
                    if(j != tmp.end && arr[tmp.end][j] != 0) {
                        if(answer[j] == 0 || (answer[j] > answer[tmp.end] + arr[tmp.end][j])) {
                            answer[j] = answer[tmp.end] + arr[tmp.end][j];
                            q.offer(new Node(tmp.end, j));
                        }
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        다익스트라 t = new 다익스트라();

        n = scanner.nextInt();
        int m = scanner.nextInt();
        answer = new int[n+1];
        arr = new int[n+1][n+1];
        for(int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int weight = scanner.nextInt();
            arr[start][end] = weight;
        }

        t.BFS(1);

        for(int i = 2; i <= n; i++) {
            System.out.print(i + " : ");
            if (answer[i] == 0) {
                System.out.print("impossible");
            } else {
                System.out.print(answer[i]);
            }
            System.out.println();
        }
    }
}
