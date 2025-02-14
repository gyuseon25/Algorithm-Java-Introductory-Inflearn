package 인프런.Section10;

import java.util.*;

public class 계단오르기 {

    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n; i++) dy[i] = dy[i-2] + dy[i-1];
        return dy[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        계단오르기 t = new 계단오르기();

        int n = scanner.nextInt();
        dy = new int[n+1];
        System.out.print(t.solution(n));
    }
}
