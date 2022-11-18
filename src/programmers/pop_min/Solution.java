package src.programmers.pop_min;

import java.util.*;

public class Solution {
    static public int[] solution(int[] arr) {
        // 에러 처리
        if (arr.length < 2){
            int[] err = {-1};
            return err;
        }

        List<Integer> list_arr = new ArrayList<>();
        for (int i : arr) {
            list_arr.add(i);
        }
        int min = Collections.min(list_arr);

        while(list_arr.contains(min)) {
            list_arr.remove(list_arr.indexOf(min));
        }

        int[] answer = new int[list_arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list_arr.get(i);
        }

        return answer;
    }
}
