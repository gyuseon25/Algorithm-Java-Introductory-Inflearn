package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 가장_짧은_문자거리 {
    public static void solution(String s) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = s.split(" ");
        String str = split[0];
        char c = split[1].charAt(0);

        for(int i = 0; i < str.length(); i++) {
            int lcount = 0, rcount = 0;
            if(i == 0) {
                for(int r = 0; r < str.length(); r++) {
                    if(str.charAt(r) == c) {
                        bw.write(rcount + " ");
                        break;
                    }
                    rcount++;
                }
            } else if (i == str.length() - 1) {
                for(int r = str.length() - 1; r >= 0; r--) {
                    if(str.charAt(r) == c) {
                        bw.write(lcount + " ");
                        break;
                    }
                    lcount++;
                }
            } else {
                for(int r = i; r < str.length(); r++) {
                    if(str.charAt(r) == c)
                        break;
                    rcount++;
                }
                for(int r = i; r >= 0; r--) {
                    if(str.charAt(r) == c)
                        break;
                    lcount++;
                }
                bw.write(Integer.min(lcount, rcount) + " ");
            }
        }

        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        solution(str);

    }
}
