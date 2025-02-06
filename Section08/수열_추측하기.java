package 인프런.Section08;

import java.util.*;

public class 수열_추측하기 {
    static int[] b, p ,ch; // b -> 곱할 수 (조합으로 나온 수), p -> 답이 될 수 있는 수 (순열로 나온 수)
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combination(int n, int r){
        if(dy[n][r] > 0 ) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = combination(n-1,r-1) + combination(n-1, r);
    }

    public void DFS(int level, int sum) {
        if(flag) return;
        if(level == n) {
            if(sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[level] = i;
                    DFS(level+1, sum + p[level]*b[level]);
                    ch[i] = 0;
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        수열_추측하기 t = new 수열_추측하기();

        n = scanner.nextInt();
        f = scanner.nextInt();

        b = new int[n];
        p = new int[n];

        ch = new int[n+1];

        for(int i = 0; i < n; i++) {
            b[i] = t.combination(n-1, i);
        }
        t.DFS(0,0);
    }
}
