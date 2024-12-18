package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 특정_문자_뒤집기 {
    public static String solution(String str) {

        int lt = 0, rt = str.length() - 1;

        char[] answer = str.toCharArray();

        while(lt < rt) {
            if(Character.isAlphabetic(answer[lt]) && Character.isAlphabetic(answer[rt])) {
                char temp = answer[lt];
                answer[lt] = answer[rt];
                answer[rt] = temp;
                lt++;
                rt--;
            } else if(Character.isAlphabetic(answer[lt])) {
                rt--;
            } else if(Character.isAlphabetic(answer[rt])) {
                lt++;
            } else {
                lt++;
                rt--;
            }
        }
        return String.valueOf(answer);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(solution(str) + " ");
        bw.flush();
        bw.close();
    }
}
