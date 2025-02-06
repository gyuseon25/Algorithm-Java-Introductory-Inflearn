package 인프런.Section08;

import java.util.*;

public class 조합_구하기 {

    static int n, m;
    static int[] c;

    public void DFS(int level, int s) {
        if(level == m) {
            for(int x : c) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = s; i <=n; i++) {
                c[level] = i;
                DFS(level+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        조합_구하기 t = new 조합_구하기();

        n = scanner.nextInt();
        m = scanner.nextInt();

        c = new int[m];

        t.DFS(0,1);
    }
}
