package 인프런.Section08;

import java.util.*;

class Board {
    int x,y;
    public Board(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 미로의_최단거리_통로_BFS {

    static int[][] arr, dis;
    static int[] dx = {-1, 0 ,1 ,0};
    static int[] dy = {0, 1 ,0 ,-1};

    public void BFS(int x, int y){
        Queue<Board> q = new LinkedList<>();
        arr[x][y] = 1;
        q.offer(new Board(x,y));

        while(!q.isEmpty()) {
            Board tmp = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    q.offer(new Board(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        미로의_최단거리_통로_BFS t = new 미로의_최단거리_통로_BFS();

        arr = new int[8][8];
        dis = new int[8][8];

        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        t.BFS(1,1);
        if(dis[7][7]==0) System.out.print(-1);
        else System.out.print(dis[7][7]);
    }
}
