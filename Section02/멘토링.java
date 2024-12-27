package 인프런.Section02;

import java.util.Scanner;

public class 멘토링 {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        int[][] flag = new int[n][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = j+1; k < n; k++){
                    flag[arr[i][j]-1][arr[i][k]-1]++;
                }
            }
        }

        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                if(flag[i][j] == m){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.print(solution(n, m, arr));

    }
}
