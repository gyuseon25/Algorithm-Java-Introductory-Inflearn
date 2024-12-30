package 인프런.Section03;

import java.util.Scanner;

public class 연속_부분수열 {
    public static int solution(int n, int m, int[] arr) {

        int answer = 0, tmp = 0;
        int lt = 0;

        for(int rt = 0; rt < n; rt++) {

            tmp += arr[rt];

            if(tmp == m)
                answer++;

            while(tmp >= m) {
                tmp -= arr[lt++];
                if(tmp == m)
                    answer++;
            }

        }

        if(tmp == m)
            answer++;

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(solution(n, m, arr));
    }
}
