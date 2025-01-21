package 인프런.Section06;

import java.util.Scanner;

public class 선택_정렬 {
    public static int[] solution(int n, int[] arr) {

        for(int i = 0; i < n; i++) {
            int min = arr[i];
            int minIndex = 0;
            for(int j = i+1; j < n; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(min != arr[i]) {
                int tmp = arr[i];
                arr[i] = min;
                arr[minIndex] = tmp;
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
