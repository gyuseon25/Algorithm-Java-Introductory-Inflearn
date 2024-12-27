package 인프런.Section03;

import java.util.Scanner;

public class 두_배열_합치기 {
    public static void solution(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] > arr2[j])
                System.out.print(arr2[j++] + " ");
            else if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else
                System.out.print(arr1[i++] + " " + arr2[j++] + " ");
        }
        if(i != arr1.length) {
            while (i < arr1.length) {
                System.out.print(arr1[i++] + " ");
            }
        }
        if(j != arr2.length) {
            while (j < arr2.length) {
                System.out.print(arr2[j++] + " ");
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

        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr2[i] = scanner.nextInt();
        }

        solution(arr1, arr2);
    }
}
