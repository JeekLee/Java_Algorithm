package src.programmers.lotto;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_numbers = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(Solution.solution(lottos, win_numbers)));
    }
}
