package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 암호 {
    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();

        String str = s.replaceAll("\\*", "0");
        str = str.replaceAll("#", "1");

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            tmp.append(charArray[i]);

            if(tmp.length() == 7){
                sb.append((char) Integer.parseInt(tmp.toString(), 2));
                tmp.setLength(0);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();

        bw.write(solution(str) + " ");
        bw.flush();
        bw.close();
    }
}
