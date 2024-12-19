package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 유효한_팰린드롬 {
    public static String solution(String str) {

        String answer = "YES";

        int lt = 0, rt = str.length() - 1;

        char[] charArray = str.toLowerCase().toCharArray();

        while(lt < rt) {
            if(!isAlphabetic(charArray[lt])) {
                lt++;
                continue;
            }
            if(!isAlphabetic(charArray[rt])) {
                rt--;
                continue;
            }
            if(charArray[lt] == charArray[rt]) {
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }
        return answer;
    }

    public static boolean isAlphabetic(char c){
        return c >= 'a' && c <= 'z';
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
