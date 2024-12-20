package 인프런.Section02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class 큰_수_출력하기 {
    public static void solution(String s) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = s.split(" ");
        int[] numArray = new int[split.length];
        int count = 0;
        for(String x : split) {
            numArray[count++] = Integer.parseInt(x);
        }

        bw.write(numArray[0]+" ");

        for (int i = 0; i < numArray.length - 1; i++) {
            if(numArray[i+1] > numArray[i]){
                bw.write(numArray[i+1]+" ");
            }
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String s = br.readLine();

        solution(s);
    }
}
