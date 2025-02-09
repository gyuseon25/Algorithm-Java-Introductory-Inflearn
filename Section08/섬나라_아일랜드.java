package 인프런.Section08;

import java.util.*;

public class 섬나라_아일랜드 {

    class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board, ch;
    static int[] dx = {-1, -1, 0, 1, 1, 1 ,0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n, answer;

    public void solution() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(ch[i][j] == 0 && board[i][j] == 1) {
                    BFS(new Point(i, j));
                }
            }
        }
    }

    public void BFS(Point p) {
        Queue<Point> q = new LinkedList<>();
        q.offer(p);
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Point tmp = q.poll();
                ch[tmp.x][tmp.y] = 1;
                for(int j = 0; j < 8; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if(nx >=0 && nx < n && ny >= 0 && ny < n && ch[nx][ny] == 0 && board[nx][ny] == 1) {
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }
        answer++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        섬나라_아일랜드 t = new 섬나라_아일랜드();

        n = scanner.nextInt();
        board = new int[n][n];
        ch = new int[n][n];

        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        t.solution();
        System.out.print(answer);
    }
}

