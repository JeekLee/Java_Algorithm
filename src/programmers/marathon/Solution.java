package src.programmers.marathon;

import java.util.*;

public class Solution {
    static public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> check =  new HashMap<>();
        for (String marathoner : participant){
            check.put(marathoner, check.getOrDefault(marathoner, 0) + 1);
        }
        for (String marathoner : completion){
            check.put(marathoner, check.get(marathoner) -1);
        }

        Set<Map.Entry<String, Integer>> entrySet = check.entrySet(); // Map Entry 객체를 Set에 담아서 리턴
        for (Map.Entry<String, Integer> entry : entrySet) { // Set에 담긴 Map Entry를 하나씩 돌면서 확인.
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

}
