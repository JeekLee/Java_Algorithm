package src.programmers.lotto;

public class Solution {
    static public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int score = 0;
        int free = 0;
        for (int i = 0; i < 6; i++) {
            if(lottos[i] == 0){
                free++;
            }
            else{
                for (int j = 0; j < 6; j++) {
                    if(lottos[i] == win_nums[j]){
                        score++;
                        break;
                    }
                }
            }
        }

        answer[0] = 6 - score - free + 1;
        answer[1] = 6 - score + 1;
        if (answer[1] > 6){
            answer[1] = 6;
        }
        if (answer[1] < 1){
            answer[1] = 1;
        }
        if (answer[0] < 1){
            answer[0] = 1;
        }
        if (answer[0] > 6 ){
            answer[0] = 6;
        }
        return answer;
    }
}
