package 인프런.Section04;

import java.util.HashMap;
import java.util.Scanner;

public class 매출액의_종류 {
    public static void solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if(rt >= k-1){
                System.out.print(map.keySet().size() + " ");
                int tmp = lt++;
                if(map.get(arr[tmp]) > 1)
                    map.put(arr[tmp], map.get(arr[tmp]) - 1);
                else
                    map.remove(arr[tmp]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        solution(n, k, arr);
    }
}
