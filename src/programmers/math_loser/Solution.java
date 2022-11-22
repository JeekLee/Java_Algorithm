package src.programmers.math_loser;

import java.util.*;

public class Solution {
     static int scoring(int[] answers, int[] loser){
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i]==loser[i% loser.length]){
                score++;
            }
        }
        return score;
    }
    static public int[] solution(int[] answers) {
        int[] answer = {};
        int[] loser1 = {1, 2, 3, 4, 5};
        int[] loser2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] loser3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> arrlist = new ArrayList<>();

        arrlist.add(scoring(answers, loser1));
        arrlist.add(scoring(answers, loser2));
        arrlist.add(scoring(answers, loser3));

        int max = Collections.max(arrlist);
        int length = Collections.frequency(arrlist, max);

        List<Integer> answerlist = new ArrayList<>();

        for (int i = 0; i < arrlist.size(); i++) {
            if(arrlist.get(i) == max){
                answerlist.add(i);
            }
        }
        answer = new int[answerlist.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerlist.get(i) + 1;
        }

        return answer;
    }
}
