package 인프런.Section07;

import java.util.Scanner;

public class 재귀함수_이진수 {
    public void solution(int n) {
        recursive(n);
    }

    public void recursive(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        else {
            recursive(n/2);
            System.out.print(n%2);
        }
    }


    public static void main(String[] args) {
        재귀함수_이진수 t = new 재귀함수_이진수();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        t.solution(n);
    }
}
