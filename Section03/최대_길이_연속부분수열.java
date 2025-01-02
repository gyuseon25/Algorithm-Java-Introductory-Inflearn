package 인프런.Section03;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {
    public static int solution(int[] arr, int k) {

        int answer = 0, count = 0, lt = 0;

        for(int rt = 0; rt < arr.length; rt++) {
            if(arr[rt] == 0) count++;
            while(count > k) {
                if(arr[lt] == 0) count--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(solution(arr, k));
    }
}
