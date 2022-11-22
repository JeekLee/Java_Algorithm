package src.programmers.hate_same;

import java.util.*;

public class Solution {
    static public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list_arr = new ArrayList<>();

        list_arr.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                list_arr.add(arr[i]);
            }
        }
        answer = new int[list_arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list_arr.get(i);
        }
        return answer;
    }
}
