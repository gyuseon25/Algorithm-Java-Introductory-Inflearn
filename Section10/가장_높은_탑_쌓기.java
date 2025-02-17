package 인프런.Section10;

import java.util.*;

class Brick implements Comparable<Brick> {
    int base, height, weight;

    public Brick(int base, int height, int weight) {
        this.base = base;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.base - this.base;
    }
}

public class 가장_높은_탑_쌓기 {

    public int solution(Brick[] arr) {
        int answer = 0;

        int[] dy = new int[arr.length];
        dy[0] = arr[0].height;

        for(int i = 1; i < arr.length; i++) {
            int max = 0;
            for(int j = i-1; j >= 0; j--) {
                if(arr[j].weight > arr[i].weight && dy[j] > max) max = dy[j];
            }
            dy[i] = max + arr[i].height;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        가장_높은_탑_쌓기 t = new 가장_높은_탑_쌓기();

        int n  = scanner.nextInt();
        Brick[] arr = new Brick[n];

        for(int i = 0; i < n; i++) {
            int base = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            arr[i] = new Brick(base, height, weight);
        }
        Arrays.sort(arr);

        System.out.print(t.solution(arr));
    }
}
