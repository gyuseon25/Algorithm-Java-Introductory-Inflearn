package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열_압축 {
    public static String solution(String str) {

        StringBuilder sb = new StringBuilder();
        char tmp = str.charAt(0);
        int count = 0; // 밑 for문에서 처음부터 다시 새니까 여긴 0으로

        for(char c : str.toCharArray()) {
            if(c == tmp) {
                count++;
            } else {
                sb.append(tmp);
                if(count > 1) {
                    sb.append(count);
                    count = 1;
                }
                tmp = c;
            }
        }

        sb.append(tmp);

        if(count > 1)
            sb.append(count);

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
