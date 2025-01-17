package 인프런.Section05;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {
    public static void solution(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(')
                stack.push(c);
            else {
                if (stack.isEmpty()) {
                    System.out.print("NO");
                    return;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty())
            System.out.print("NO");
        else
            System.out.print("YES");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        solution(str);
    }
}
