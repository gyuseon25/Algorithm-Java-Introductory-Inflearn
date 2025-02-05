package 인프런.Section08;

import java.util.*;

public class 동전교환 {

    static int n, m, answer;
    static ArrayList<Integer> arr;

    public int BFS(int sn) {
        Queue<Integer> q = new LinkedList<>();

        int idx = 1;
        q.offer(sn);

        while(true) {
            if(idx >= answer)
                break;
            if(q.peek() > m)
                break;
            int len = q.size();
            for(int i = 0; i < len; i++) {
                int tmp = q.poll();
                if(tmp > m) {
                    continue;
                }
                if(tmp == m) {
                    return idx;
                }
                for(int j : arr) {
                    if(tmp + j > m)
                        break;
                    q.offer(tmp + j);
                }
            }
            idx++;
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        동전교환 t = new 동전교환();

        n = scanner.nextInt();
        arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        m = scanner.nextInt();

        Collections.sort(arr, Collections.reverseOrder());

        answer = Integer.MAX_VALUE;
        for(int i : arr) {
            answer = Math.min(answer, t.BFS(i));
        }
        System.out.print(answer);
    }
}
