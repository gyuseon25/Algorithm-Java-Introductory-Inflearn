package 인프런.Section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정_설계 {
    public static String solution(String required, String plan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for(char c : plan.toCharArray()) {
            queue.offer(c);
        }

        for(char c : required.toCharArray()) {
            if(!queue.contains(c)) {
                answer = "NO";
                break;
            }
            while(queue.peek() == c)
                queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String required = scanner.next();
        String plan = scanner.next();

        System.out.print(solution(required, plan));
    }
}
