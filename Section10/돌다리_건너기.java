package 인프런.Section10;

import java.util.*;

public class 돌다리_건너기 {

    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n+1; i++) dy[i]=dy[i-2]+dy[i-1];
        return dy[n+1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        돌다리_건너기 t = new 돌다리_건너기();

        int n = scanner.nextInt();
        dy = new int[n+2];
        System.out.print(t.solution(n));

    }
}
