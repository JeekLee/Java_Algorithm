package src.programmers.strange_string;

public class Solution {
    static public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] tmp = words[i].toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if (j%2==0){
                    tmp[j] = Character.toUpperCase(tmp[j]);
                }
                else {
                    tmp[j] = Character.toLowerCase(tmp[j]);
                }
            }
            words[i] = new String(tmp); // Char 배열을 String 생성 인자로 넣으면 생성됨

            if ( i== words.length -1 ){
                answer = answer + words[i];
            }
            else {
                answer = answer + words[i] + " ";
            }
        }
        while (answer.length() < s.length()){
            answer = answer + " ";
        }
        return answer;
    }
}