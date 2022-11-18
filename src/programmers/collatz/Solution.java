package src.programmers.collatz;

public class Solution {
    static public int solution(int num_input) {
        int answer = 0;
        long num = num_input;
        while( answer<501 && num != 1){
            answer++;
            if(num%2 == 0){
                num = num/2;
            }
            else {
                num = num*3 + 1;
            }
            System.out.println(num);
        }
        if (answer>=500){
            return -1;
        }
        return answer;
    }
}
