package src.programmers.divisor;

import java.util.*;

public class Solution {
    static public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        boolean flag = false;
        List<Integer> mallocArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i] % divisor;
            if (tmp == 0){
                mallocArray.add(arr[i]);
                flag = true;
            }
        }
        if (flag == false){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        mallocArray.sort(Comparator.naturalOrder());

        answer = new int[mallocArray.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mallocArray.get(i);
        }

        return answer;
    }

}
