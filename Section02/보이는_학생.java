package 인프런.Section02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 보이는_학생 {
    public static int solution(String s) {

        int answer = 1;

        String[] split = s.split(" ");
        int[] numArray = new int[split.length];
        int count = 0;
        for(String x : split) {
            numArray[count++] = Integer.parseInt(x);
        }

        int min = numArray[0];

        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] > min) {
                answer++;
                min = numArray[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String s = br.readLine();

        bw.write(solution(s) + "");
        bw.flush();
        bw.close();
    }
}
