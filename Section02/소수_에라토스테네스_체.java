package 인프런.Section02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class 소수_에라토스테네스_체 {
    public static int solution(int num) {
        boolean[] flag = new boolean[num + 1];
        Arrays.fill(flag,true);

        int answer = 0;

        for(int i = 2; i <= num; i++) {
            if(flag[i] == true) {
                answer++;
                for(int j = i; j <= num; j += i) {
                    flag[j] = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(solution(num) + "");
        bw.flush();
        bw.close();
    }
}