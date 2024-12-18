package 인프런.Section01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class 단어_뒤집기 {
    public static List<String> solution(List<String> list) {
        StringBuilder sb;

        List<String> answer = new ArrayList<>();

        for(String s : list) {
            sb = new StringBuilder();
            for(int i = s.length() - 1 ; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            answer.add(sb.toString());
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            list.add(s);
        }

        for (String s : solution(list)) {
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();
    }
}
