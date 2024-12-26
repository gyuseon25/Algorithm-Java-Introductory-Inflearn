package 인프런.Section02;

import java.util.Scanner;

public class 격자판_최대합 {
    public static int solution(int[][] arr) {
        int answer = 0;

        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                sum += arr[i][j];
            }
            if(sum >= answer)
                answer = sum;
            sum = 0;
        }

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                sum += arr[j][i];
            }
            if(sum >= answer)
                answer = sum;
            sum = 0;
        }

        for(int i = 0; i < arr.length ; i++){
            sum += arr[i][i];
        }
        if(sum >= answer)
            answer = sum;
        sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(i+j == arr.length)
                    sum += arr[i][j];
            }
        }
        if(sum >= answer)
            answer = sum;

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.print(solution(arr));
    }
}
