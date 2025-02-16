package 인프런.Section10;

import java.util.*;

public class 최대_부분_증가수열 {

    static int[] dp;

    public int solution(int[] arr) {
        int answer = 0;
        dp = new int[arr.length];
        dp[0] = 1;
        for(int i = 1; i < arr.length; i++){
            int max=0;
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] < arr[i] && dp[j] > max) max = dp[j];
            }
            dp[i] = max + 1;
            answer=Math.max(answer, dp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        최대_부분_증가수열 t = new 최대_부분_증가수열();

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(t.solution(arr));
    }
}
