package 인프런.Section04;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static void solution(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for(char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for(char x : map1.keySet()) {
            if(map1.get(x) != map2.get(x)) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        solution(str1, str2);
    }
}
