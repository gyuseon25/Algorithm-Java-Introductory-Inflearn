package 인프런.Section08;

import java.util.*;

public class 조합의_경우수 {

    int[][] dy;

    public int combination(int n, int r) {
        int answer = 0;

        if(dy[n][r] != 1) return dy[n][r];

        if(n == r) return 1;
        if(r == 1) return n;

        answer = dy[n][r] =combination(n-1, r-1) + combination(n-1, r);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        조합의_경우수 t = new 조합의_경우수();

        int n = scanner.nextInt();
        int r = scanner.nextInt();

        dy = new int[n+1][r+1];

        System.out.print(t.combination(n, r));
    }
}
