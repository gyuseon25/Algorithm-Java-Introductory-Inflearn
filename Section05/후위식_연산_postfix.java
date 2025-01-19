package 인프런.Section05;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산_postfix {
    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                stack.push(c - 48);
            } else {
               int b = stack.pop();
               int a = stack.pop();
               int tmp = calculate(a, b, c);
               stack.push(tmp);
            }
        }
        return stack.pop();
    }

    public static int calculate(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                return a / b;
            case '*':
                return a * b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.print(solution(str));
    }
}
