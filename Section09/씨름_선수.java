package 인프런.Section09;

import java.util.*;

class Body implements Comparable<Body> {
    int height, weight;
    public Body(int h, int w) {
        height = h;
        weight = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.height - this.height; //키 기준 내림차순 정렬하기 위해
    }
}

public class 씨름_선수 {

    public int solution(ArrayList<Body> arr) {
        int answer = 0;
        Collections.sort(arr);

        int max = Integer.MIN_VALUE;
        for(Body b : arr) {
            if(b.weight > max) {
                max = b.weight;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        씨름_선수 t = new 씨름_선수();

        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.print(t.solution(arr));
    }
}

