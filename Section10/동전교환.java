package 인프런.Section10;

import java.util.*;

public class 동전교환 {

    static int n, m;

    public int solution(int[] coin) {
        int[] dy = new int[m+1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for(int i = 0; i < n; i++) {
            for(int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        동전교환 t = new 동전교환();

        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        m = scanner.nextInt();

        System.out.print(t.solution(arr));
    }
}
