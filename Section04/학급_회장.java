package 인프런.Section04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 학급_회장 {
    public static char solution(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        char answer = ' ';

        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        Set<Character> characters = map.keySet();
        for(Character character : characters) {
            if(map.get(character) > max) {
                max = map.get(character);
                answer = character;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String str = scanner.next();

        System.out.print(solution(str));
    }
}
