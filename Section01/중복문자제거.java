package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 중복문자제거 {
    public static String solution(String str) {

        char[] charArray = str.toCharArray();

       StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            if(!sb.toString().contains(String.valueOf(c)))
                sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(solution(str) + "");
        bw.flush();
        bw.close();
    }
}
