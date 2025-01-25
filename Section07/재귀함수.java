package 인프런.Section07;

import java.util.Scanner;

public class 재귀함수 {

    public void solution(int n) {
        recursive(n);
    }

    public void recursive(int n) {
        if(n == 0)
            return;
        else {
            recursive(n-1);
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        재귀함수 t = new 재귀함수();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        t.solution(n);
    }
}
