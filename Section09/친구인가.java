package 인프런.Section09;

import java.util.*;

public class 친구인가 {

    static int[] unf;

    public int find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] =find(unf[v]);
    }

    public void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        친구인가 t = new 친구인가();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        unf = new int[n+1];
        for(int i = 1; i <= n; i++) unf[i] = i;
        for(int i = 1; i <= m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            t.union(a,b);
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int fa = t.find(a);
        int fb = t.find(b);
        if(fa != fb) System.out.print("NO");
        else  System.out.print("YES");
    }
}
