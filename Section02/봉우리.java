package 인프런.Section02;

import java.util.Scanner;

public class 봉우리 {
    public static int solution(int num, int[][] arr) {
        int answer = 0;

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(arr[i][j] > arr[i][j+1] &&
                arr[i][j] > arr[i][j-1] &&
                arr[i][j] > arr[i+1][j] &&
                arr[i][j] > arr[i-1][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[num+2][num+2];
        for (int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.print(solution(num, arr));
    }
}
