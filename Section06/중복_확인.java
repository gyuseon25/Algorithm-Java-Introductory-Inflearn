package 인프런.Section06;

import java.util.ArrayList;
import java.util.Scanner;

public class 중복_확인 {
    public static void solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if (list.contains(i)) {
                System.out.print("D");
                return;
            } else {
                list.add(i);
            }
        }
        System.out.print("U");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(n, arr);
    }
}
