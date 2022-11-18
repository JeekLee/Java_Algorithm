package src.programmers.watermelon;

public class Solution {
    static public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i%2 == 1){
                answer = answer.concat("박");
            }
            else{
                answer = answer.concat("수");
            }
        }

        return answer;
    }
}
