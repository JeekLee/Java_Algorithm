package src.programmers.plus_digits;

public class Solution {
    static public int solution(int n) {
        int answer = 0;
        String tmp = String.valueOf(n);             // 입력된 int를 문자열로 변환
        char[] arr = tmp.toCharArray();             // 문자열을 char의 배열로 변환
        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i] - '0';         // 아스키 코드 연산
        }
        return answer;
    }
}
