package 인프런.Section08;

import java.util.*;

class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 토마토 {

    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int m, n, answer = -1; // 시작할 때 익어있던 토마토 세는 경우는 제외해야하니까
    static boolean checkFlag = false;

    public void check() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0)
                    return;
            }
        }
        checkFlag = true;
    }

    public void BFS(ArrayList<Point_14> starts) {
        Queue<Point_14> q = new LinkedList<>();
        for(Point_14 p : starts) {
            q.add(p);
        }

        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Point_14 tmp = q.poll();
                for(int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        q.offer(new Point_14(nx, ny));
                    }
                }
            }
            answer++;
        }
        check();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        토마토 t = new 토마토();
        boolean flag = false;

        m = scanner.nextInt();
        n = scanner.nextInt();

        arr = new int[n][m];
        ArrayList<Point_14> starts = new ArrayList<>();

        for(int x = 0; x < n; x++) {
            for(int y = 0 ; y < m ; y++) {
                arr[x][y] = scanner.nextInt();
                if(arr[x][y] == 0) flag = true;
                if(arr[x][y] == 1) starts.add(new Point_14(x, y));
            }
        }

        t.BFS(starts);

        if (!flag) {
            System.out.print(0);
            return;
        }
        if(checkFlag) {
            System.out.print(answer);
        } else {
            System.out.print(-1);
        }

    }
}
