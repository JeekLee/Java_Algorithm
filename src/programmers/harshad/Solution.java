package src.programmers.harshad;

public class Solution {
    static public boolean solution(int x) {
        boolean answer = false;
        int digits = (int) Math.log10(x) + 1;
        int tmp = x;
        int sum = 0;
        for (int i = 0; i < digits; i++) {
            sum = sum + tmp%10;
            tmp = tmp/10;
        }
        if (x%sum == 0){
            answer = true;
        }
        return answer;
    }
}
