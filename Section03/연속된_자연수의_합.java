package 인프런.Section03;

import java.util.Scanner;

public class 연속된_자연수의_합 {
    public static int solution(int n) {

        int answer = 0, tmp = 1;
        int lt = 1, rt = 2;

        while(rt <= (n/2)+1) {
            tmp += rt++;
            if(tmp == n) answer++;
            while(tmp >= n) {
                tmp -= lt++;
                if(tmp == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(solution(n));
    }
}
