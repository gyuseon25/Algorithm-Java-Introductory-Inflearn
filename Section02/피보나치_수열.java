package 인프런.Section02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class 피보나치_수열 {
    public static void solution(int num) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("1 ");
        bw.write("1 ");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        for(int i = 2; i < num; i++) {
            list.add(list.get(i-2) + list.get(i-1));
            bw.write(list.get(i) + " ");
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        solution(num);

    }
}
