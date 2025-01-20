package 인프런.Section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {
    public static int solution(int n, int m, int[] arr) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>(); // 위험도 관련 큐
        Queue<Integer> order = new LinkedList<>(); // 순서 관련 큐

        for(int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            order.add(i);
        }

        while(true) {
            int tmp = queue.poll();
            boolean flag = false;
            int tmpo = order.poll();
            for(int i = 0; i < queue.size(); i++) {
                int tmp2 = queue.poll();
                if(tmp < tmp2) {
                    flag = true;
                }
                queue.add(tmp2);
            } //큐 한 바퀴 돌면서 큰거 있는지 확인

            if(flag) {
                queue.offer(tmp);
                order.offer(tmpo);
            } // 큰 거 있을때 (flag == true) 위험도랑 순서 다시 넣기
            else {
                answer++;
               if(tmpo == m)
                   return answer;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.print(solution(n, m ,arr));
    }
}
