package 인프런.Section08;

import java.util.*;

class Point_14 {
    int x, y;
    public Point_14(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 피자_배달_거리 {


    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point_14> pizza = new ArrayList<>();
    static ArrayList<Point_14> house = new ArrayList<>();


    public void DFS(int level, int s) {
        if(level == m) {
            int sum = 0;
            for(Point_14 h : house) {
                int dis = Integer.MAX_VALUE;
                for(int i : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for(int i = s; i < len; i++) {
                combination[level] = i;
                DFS(level + 1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        피자_배달_거리 t = new 피자_배달_거리();

        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int tmp = scanner.nextInt();
                if(tmp == 1) house.add(new Point_14(i, j));
                else if(tmp == 2) pizza.add(new Point_14(i, j));
            }
        }
        len = pizza.size();
        combination = new int[m];

        t.DFS(0, 0);

        System.out.print(answer);
    }
}
