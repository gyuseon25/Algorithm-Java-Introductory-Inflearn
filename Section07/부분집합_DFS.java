package 인프런.Section07;

import java.util.Scanner;

public class 부분집합_DFS {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if(L == n+1) {
            String tmp = "";
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1; //부분집합에 포함하는 경우
            DFS(L+1);
            ch[L] = 0; //부분집합에 포함하지 않는 경우
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        부분집합_DFS t = new 부분집합_DFS();

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        ch = new int[n+1];

        t.DFS(1);
    }
}
