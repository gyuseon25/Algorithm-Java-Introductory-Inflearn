package 인프런.Section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주_구하기 {
    public static int solution(int n, int k) {
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i  = 1; i <= n; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            int tmp = queue.poll();
            if(++count == k) {
                count = 0;
                continue;
            }
            queue.add(tmp);
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print(solution(n, k));
    }
}
