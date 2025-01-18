package 인프런.Section05;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기_카카오 {
    public static int solution(int n, int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for(int pos : moves) {
            for(int i = 0; i < n; i++) {
                if(board[i][pos-1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[i][pos-1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][pos - 1]);
                    }
                    board[i][pos-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.print(solution(n, board, moves));
    }
}
