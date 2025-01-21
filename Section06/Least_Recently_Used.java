package 인프런.Section06;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Least_Recently_Used {
    public static Deque<Integer> solution(int s, int[] arr) {

        Deque<Integer> deque = new LinkedList<>();

        for(int i : arr) {
            if(deque.contains(i)) {
                deque.remove(i);
                deque.addFirst(i);
            } else {
                if(deque.size() == s) {
                    deque.removeLast();
                }
                deque.addFirst(i);
            }
        }
        return deque;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Deque<Integer> result = solution(s, arr);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
