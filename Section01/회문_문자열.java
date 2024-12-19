package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 회문_문자열 {
    public static boolean solution(String str) {

        boolean result = true;

        int lt = 0, rt = str.length() - 1;

        char[] answer = str.toLowerCase().toCharArray();

        while(lt < rt) {
            if(answer[lt] != answer[rt]) {
                return false;
            }
            lt++; rt--;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        if(solution(str))
            bw.write("YES");
        else
            bw.write("NO");
        bw.flush();
        bw.close();
    }
}
