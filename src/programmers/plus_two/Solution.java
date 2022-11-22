package src.programmers.plus_two;

import java.util.*;

public class Solution {
    static public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> arrlist = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int tmp = numbers[i] + numbers[j];
                if(!arrlist.contains(tmp)){
                    arrlist.add(tmp);
                }
            }
        }

        arrlist.sort(Comparator.naturalOrder());
        answer = new int[arrlist.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}
