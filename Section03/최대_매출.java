package 인프런.Section03;

import java.util.Scanner;

public class 최대_매출 {
    public static int solution(int n, int k, int[] arr) {

        int tmp = 0;
        for(int i = 0; i < k; i++) {
            tmp += arr[i];
        }

        int answer = tmp;

        for(int i = 1; i < n-k+1; i++) {
            tmp -= arr[i-1];
            tmp += arr[i+k-1];
            answer = Math.max(answer, tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }
}
