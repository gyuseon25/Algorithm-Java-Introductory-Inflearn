package 인프런.Section04;

import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
    public static int solution(String str1, String str2) {

        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int lt = 0; int rt = str2.length() - 1;
        boolean flag = false;

        while(rt < str1.length()) {
            for(int i = lt; i <= rt; i++) {
                 map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            }
            for(char x : str2.toCharArray()) {
                if(!map.containsKey(x) || map.get(x) == 0) {
                    flag = true;
                    break;
                }
                map.put(x, map.get(x) - 1);
            }

            if(!flag)
                count++;
            flag = false;
            map.clear();
            lt++; rt++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.print(solution(str1, str2));
    }
}
