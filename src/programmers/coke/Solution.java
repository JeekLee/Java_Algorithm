package src.programmers.coke;

public class Solution {
    public static int solution(int a, int b, int n){
        int answer = 0;
        while (n/a >= 1){
            System.out.println("남은 병의 수: " + n);
            int quotient = n/a;
            int remainder = n%a;
            System.out.println("몫: " + quotient);
            System.out.println("나머지: " + remainder);

            answer = answer + quotient*b;
            n = (quotient*b) + remainder;
        }
        return answer;
    }
}
