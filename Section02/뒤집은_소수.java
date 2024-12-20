package 인프런.Section02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 뒤집은_소수 {
    public static void solution(String s, BufferedWriter bw) throws IOException {


        String[] split = s.split(" ");

        for (String str : split) {
            int num =  Integer.parseInt(new StringBuilder(str).reverse().toString());
            if(isPrime(num))
                bw.write(num + " ");
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String s = br.readLine();

        solution(s, bw);
        bw.flush();
        bw.close();
    }
}
