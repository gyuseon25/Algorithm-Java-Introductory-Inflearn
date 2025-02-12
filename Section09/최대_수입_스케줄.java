package 인프런.Section09;

import java.util.*;

class Schedule implements Comparable<Schedule> {
    int money, day;
    public Schedule(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Schedule s) {
        return s.money - this.money;
    }
}

public class 최대_수입_스케줄 {

    public int solution(PriorityQueue<Schedule> q, int max) {
        int answer = 0;
        int[] ch = new int[max];
        while(!q.isEmpty()) {
            Schedule tmp = q.poll();
            if(ch[tmp.day] == 0) {
                ch[tmp.day] = 1;
                answer += tmp.money;
            } else {
                for(int i = tmp.day -1; i >= 0; i--) {
                    if(ch[i] == 0) {
                        ch[i] = 1;
                        answer += tmp.money;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        최대_수입_스케줄 t = new 최대_수입_스케줄();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        PriorityQueue<Schedule> q = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            q.offer(new Schedule(m, d-1));
            max = Math.max(max, m);
        }

        System.out.print(t.solution(q, max));
    }
}
