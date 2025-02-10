package 인프런.Section09;

import java.util.*;

class Meeting implements Comparable<Meeting> {
    int start, end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end) return this.start - o.start; // 끝나는 시간 같다면 시작 시간 기준 오름차순 정렬
        else return this.end - o.end; //끝나는 시간 기준 오름차순 정렬
    }
}

public class 회의실_배정 {

    public int solution(ArrayList<Meeting> arr) {
        int answer = 0;

        Collections.sort(arr);

        int end = 0;

        for(Meeting m : arr) {
            if(end <= m.start) {
                answer++;
                end = m.end;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        회의실_배정 t = new 회의실_배정();

        int n = scanner.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            arr.add(new Meeting(start, end));
        }

        System.out.print(t.solution(arr));
    }
}
