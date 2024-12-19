package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 숫자만_추출 {
    public static String solution(String str) {

        String answer = str.replaceAll("[^0-9]", "");

        while(answer.startsWith("0")) {
            answer = answer.substring(1);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
        bw.close();
    }
}
