package 인프런.Section08;

import java.util.*;

public class 중복순열_구하기 {

    static int n, m;

    public void DFS(int level, String str) {
        if(level == m) {
            System.out.println(str);
            return;
        }
        for(int i = 1; i <= n; i++) {
            DFS(level+1, str + " " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        중복순열_구하기 t = new 중복순열_구하기();

        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            t.DFS(1, String.valueOf(i));
        }
    }
}
