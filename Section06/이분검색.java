package 인프런.Section06;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static void solution(int n, int m, int[] arr) {

        Arrays.sort(arr);
        int idx = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == m) {
                idx = i + 1;
                break;
                }
        }
        System.out.print(idx);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(n, m, arr);
    }
}
