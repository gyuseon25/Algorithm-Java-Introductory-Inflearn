package 인프런.Section02;

import java.util.Scanner;

public class 점수_계산 {
    public static int solution(int[] arr) {
        int result = 0;

        int tmp = 1;

        for (int i : arr) {
            if(i == 1){
                result += tmp++;
                continue;
            }
            tmp = 1;
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
        System.out.print(solution(arr));
    }
}
