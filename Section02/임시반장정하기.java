package 인프런.Section02;

import java.util.Scanner;

public class 임시반장정하기 {
    public static int solution(int num, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < num; i++) {
            int cnt = 0;
            for(int j = 0; j < num; j++) {
                for(int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }


        return ++answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[num][5];
        for (int i = 0; i < num; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.print(solution(num, arr));
    }
}
