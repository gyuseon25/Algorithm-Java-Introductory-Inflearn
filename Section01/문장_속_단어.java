package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문장_속_단어 {
    public static String solution(String[] splits) {
        String answer = "";
        int max = 0;

        for(String s : splits) {
            if(s.length() > max) {
                max = s.length();
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] splits = str.split(" ");

        bw.write(solution(splits));
        bw.flush();
        bw.close();
    }
}
