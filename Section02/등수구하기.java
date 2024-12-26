package 인프런.Section02;

import java.util.Arrays;
import java.util.Scanner;

public class 등수구하기 {
    public static int[] solution(int[] arr) {

        int[] result = new int[arr.length];
        boolean[] flag = new boolean[arr.length];
        Arrays.fill(flag,false);
        int rank = 1;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;

            for(int j = 0; j < arr.length; j++){
                if(!flag[j] && arr[j] > max){
                    max = arr[j];
                }
            }

            for(int j = 0; j < arr.length; j++){
                if(!flag[j] && arr[j] == max){
                    flag[j] = true;
                    result[j] = rank;
                    count++;
                }
            }
            rank += count;
            count = 0;
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] solution = solution(arr);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
