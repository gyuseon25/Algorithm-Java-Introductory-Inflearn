package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자찾기 {

    public static int solution(String str, char ch) {
        int answer = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toLowerCase();
        char ch = br.readLine().toLowerCase().charAt(0);

        bw.write(solution(str, ch) + "\n");
        bw.flush();
        bw.close();
    }
}
