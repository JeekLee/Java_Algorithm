package src.programmers.reversed_ternary;

import java.util.*;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        List<Integer> list_arr = new ArrayList<>();
        while(n>0){
            list_arr.add(n%3);
            n = n/3;
        }
        for (int i = 0; i < list_arr.size(); i++) {
            answer = answer*3 + list_arr.get(i);
        }
        return answer;
    }
}
