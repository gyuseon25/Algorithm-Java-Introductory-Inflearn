package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 대소문자_변환 {
    public static String solution(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
                sb.append(Character.toUpperCase(str.charAt(i)));
            else
                sb.append(Character.toLowerCase(str.charAt(i)));
        }

        return sb.toString();
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
