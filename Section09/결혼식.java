package 인프런.Section09;

import java.util.*;

class Time03 implements Comparable<Time03> {
    int t;
    char s; // 오는시간 -> 's' , 가는 시간 -> 'e'
    public Time03(int t, char s) {
        this.t = t;
        this.s = s;
    }

    @Override
    public int compareTo(Time03 o) {
        if(this.t == o.t) return this.s - o.s; // 시간 같다면 상태 기준  오름차순
        else return this.t - o.t; // 시간 기준 오름차순 정렬
    }
}

public class 결혼식 {

    public int solution(ArrayList<Time03> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for(Time03 t : arr) {
            if(t.s == 's') cnt++;
            else cnt--;
            answer = Math.max(cnt, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        결혼식 t = new 결혼식();

        int n = scanner.nextInt();
        ArrayList<Time03> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int sT = scanner.nextInt();
            int eT = scanner.nextInt();
            arr.add(new Time03(sT, 's'));
            arr.add(new Time03(eT, 'e'));
        }

        System.out.print(t.solution(arr));
    }
}
