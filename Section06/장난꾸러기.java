package 인프런.Section06;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public static void solution(int n, int[] arr) {

        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        for(int i = 0; i < n; i++) {
            if (arr[i] != arr2[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(n, arr);
    }
}
