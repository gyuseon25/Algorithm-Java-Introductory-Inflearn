package 인프런.Section08;

import java.util.Scanner;

class Problem {
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class 최대점수_구하기_DFS {

    static int n, m;
    static Problem[] arr;
    int answer = 0;

    public void DFS(int idx, int time, int score) {
        if(time > m) return;
        if(idx == n) {
            answer = Math.max(answer, score);
            return;
        }
        DFS(idx+1, time + arr[idx].time, score + arr[idx].score);
        DFS(idx+1, time, score);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        최대점수_구하기_DFS t = new 최대점수_구하기_DFS();

        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new Problem[n];

        for(int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            arr[i] = new Problem(score, time);
        }

        t.DFS(0, 0, 0);

        System.out.print(t.answer);
    }
}
