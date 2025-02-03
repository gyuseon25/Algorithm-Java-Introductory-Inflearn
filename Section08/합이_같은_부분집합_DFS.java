package 인프런.Section08;

import java.util.Scanner;

public class 합이_같은_부분집합_DFS {

    static String answer = "NO";
    static int[] arr;
    static int[] ch;
    static int n; 

    public void solution() {
        ch[0] = 1;
        DFS(0, 0, 0);
        ch[0] = 0;
        DFS(0, 0, 0);
    }

    //s1 -> 포함하는 수의 합, s2 - 포함안하는 수의 합
    public void DFS(int idx, int s1, int s2) {

        int sum1 = s1, sum2 = s2;
        if(ch[idx] == 1) sum1 += arr[idx];
        else sum2 += arr[idx];

        if(idx == n - 1) {
            if(sum1 == sum2) answer = "YES";
            return;
        }


        int ni = idx + 1;
        ch[ni] = 1;
        DFS(ni, sum1, sum2);
        ch[ni] = 0;
        DFS(ni, sum1, sum2);
    }

    public static void main(String[] args) {
        합이_같은_부분집합_DFS t = new 합이_같은_부분집합_DFS();

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n];
        ch = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        t.solution();
        System.out.print(answer);
    }

}
