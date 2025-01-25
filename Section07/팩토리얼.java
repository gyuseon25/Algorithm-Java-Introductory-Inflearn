package 인프런.Section07;

import java.util.Scanner;

public class 팩토리얼 {
    public void solution(int n) {
        System.out.print(recursive(n));
    }

    public int recursive(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n*recursive(n-1);
        }
    }


    public static void main(String[] args) {
        팩토리얼 t = new 팩토리얼();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        t.solution(n);
    }
}
