package 인프런.Section02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 가위바위보 {
    public static void solution(String a, String b) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] aSplit = a.split(" ");
        String[] bSplit = b.split(" ");

        int[] aArray = new int[aSplit.length];
        int[] bArray = new int[bSplit.length];

        for (int i = 0; i < aSplit.length; i++) {
            aArray[i] = Integer.parseInt(aSplit[i]);
            bArray[i] = Integer.parseInt(bSplit[i]);
        }

        for (int i = 0; i < aArray.length; i++) {
            if(aArray[i] == bArray[i]) bw.write("D\n");
            else if(aArray[i] == 3 && bArray[i] == 1) bw.write("B\n");
            else if(aArray[i] == 1 && bArray[i] == 3) bw.write("A\n");
            else if(aArray[i] < bArray[i]) bw.write("B\n");
            else bw.write("A\n");
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String aArray = br.readLine();
        String bArray = br.readLine();

        solution(aArray, bArray);
    }
}
