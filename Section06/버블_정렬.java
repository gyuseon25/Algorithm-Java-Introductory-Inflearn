package 인프런.Section06;

import java.util.Scanner;

public class 버블_정렬 {
    public static int[] solution(int n, int[] arr) {

        for(int i = n-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = solution(n, arr);
        for(int i : result) {
            System.out.print(i + " ");
        }

    }
}
