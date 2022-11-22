package src.programmers.reverse_string;

import java.util.*;

public class Solution {
    static public String solution(String s) {
        String answer = "";
        char[] chararr = s.toCharArray();
        List<Character> listarr = new ArrayList<>();
        for (int i = 0; i < chararr.length; i++) {
            listarr.add(chararr[i]);
        }
        Collections.sort(listarr, Collections.reverseOrder());
        for (int i = 0; i < chararr.length; i++) {
            chararr[i] = listarr.get(i);
        }

        answer = new String(chararr);

        return answer;
    }
}
