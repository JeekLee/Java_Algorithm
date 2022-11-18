package src.programmers.y2016;

public class Solution {
    public static String solution(int a, int b){
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] count_days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] first_days = new int[12];
        first_days[0] = 0;
        for (int i = 1; i < first_days.length; i++) {
            first_days[i] = ((count_days[i-1]%7) + first_days[i-1])%7;
        }
        int distance = (b - 1) % 7;
        int answer_index = (distance + first_days[a-1])%7;
        answer = days[answer_index];

        return answer;
    }
}
