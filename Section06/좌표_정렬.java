package 인프런.Section06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 좌표_정렬 {
    static class Position {
        int x;
        int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
    public static Position[] solution(int n, Position[] arr) {

        Arrays.sort(arr, new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                if(o1.x > o2.x)
                    return 1;
                else if(o1.x == o2.x) {
                    if(o1.y > o2.y)
                        return 1;
                    else
                        return -1;
                } else
                    return -1;
            }
        });

        return arr;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Position[] arr = new Position[n];

        for(int i = 0; i < n; i++) {
            Position p = new Position(scanner.nextInt(), scanner.nextInt());
            arr[i] = p;
        }

        Position[] result = solution(n, arr);

        for(Position p : result) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
