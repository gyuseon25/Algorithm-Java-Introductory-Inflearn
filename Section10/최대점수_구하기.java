package 인프런.Section10;

import java.util.*;

class Problem {
    int score, time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class 최대점수_구하기 {

    static int m;

    public int solution(ArrayList<Problem> arr) {
        int[] dy = new int[m+1];

        for(Problem p : arr) {
            int ps = p.score;
            int pt = p.time;
            for(int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        최대점수_구하기 t = new 최대점수_구하기();

        int n = scanner.nextInt();
        m = scanner.nextInt();

        ArrayList<Problem> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            arr.add(new Problem(score, time));
        }

        System.out.print(t.solution(arr));
    }
}
