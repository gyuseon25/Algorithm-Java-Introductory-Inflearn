package 인프런.Section08;

import java.util.Scanner;

public class 바둑이_승차_DFS {

    static int[] arr;
    static int answer = 0, c, n;

    public void DFS(int idx, int sum) {
        if(idx == n) {
            if(sum <= c) {
                answer = Math.max(answer, sum);
            }
            return;
        }
        DFS(idx+1, sum + arr[idx]);
        DFS(idx+1, sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        바둑이_승차_DFS t = new 바둑이_승차_DFS();

        c = scanner.nextInt();
        n = scanner.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        t.DFS(0, 0);
        System.out.print(answer);

    }
}
