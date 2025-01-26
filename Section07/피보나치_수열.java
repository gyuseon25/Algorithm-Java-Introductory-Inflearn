package 인프런.Section07;

import java.util.Scanner;

public class 피보나치_수열 {

    static int[] arr;

    public int recursive(int n) {
        if(arr[n] > 0) return arr[n];
        else if(n == 1 || n == 2) return arr[n] = 1;
        else return arr[n] = recursive(n - 2) + recursive(n - 1);
    }


    public static void main(String[] args) {
        피보나치_수열 t = new 피보나치_수열();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        arr = new int[n+1];

        t.recursive(n);
        for(int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
