package 인프런.Section05;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static int solution(String str) {
        int answer = 0;
        int count = 0; //쇠막대기 갯수
        char pre = '0'; //앞에 문자
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
                count++;
                answer++;
            } else if(c == ')') {
                if(pre == '(') {
                    count--;
                    answer--;
                    answer += count;
                } else if(pre == ')') {
                    count--;
                }
            }
            pre = c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.print(solution(str));
    }
}
