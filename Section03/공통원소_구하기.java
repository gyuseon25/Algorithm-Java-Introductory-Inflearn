package 인프런.Section03;

import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기 {
    public static void solution(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr1[i] > arr2[j]) {
                j++;
            }else if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++; j++;
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int[] arr1 = new int[m];
        for(int i = 0; i < m; i++){
            arr1[i] = scanner.nextInt();
        }
        Arrays.sort(arr1);

        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr2[i] = scanner.nextInt();
        }
        Arrays.sort(arr2);
        solution(arr1, arr2);
    }
}