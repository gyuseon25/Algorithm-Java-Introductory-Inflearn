package 인프런.Section06;

import java.util.Scanner;

public class 삽입_정렬 {
    public static int[] solution(int n, int[] arr) {

        for(int i = 1; i < n; i++){
            int tmp = arr[i], j; //삽입 값을 tmp에 저장
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) // 비교 값이 삽입 값 보다 크다?
                    arr[j+1] = arr[j]; // 한칸씩 뒤로 민다
                else // 비교 값이 삽입 값보다 작으면 삽입할 곳을 찾았으므로 멈춘다.
                    break;
            }
            arr[j+1] = tmp;
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
