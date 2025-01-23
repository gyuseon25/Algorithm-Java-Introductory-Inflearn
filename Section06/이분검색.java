package 인프런.Section06;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static int solution(int n, int m, int[] arr) {

        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            else if(arr[mid] > m) rt = mid -1;
            else lt = mid + 1;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(solution(n, m, arr));
    }
}
