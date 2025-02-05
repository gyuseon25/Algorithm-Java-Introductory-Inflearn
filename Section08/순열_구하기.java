package 인프런.Section08;

import java.util.*;

public class 순열_구하기 {

    static int n, m;
    static int[] arr, pm, ch;

    public void DFS(int level) {
        if(level == m) {
            for(int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[level] = arr[i];
                    DFS(level+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        순열_구하기 t = new 순열_구하기();

        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[n];
        ch = new int[n];
        pm = new int[m];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        t.DFS(0);

    }
}
