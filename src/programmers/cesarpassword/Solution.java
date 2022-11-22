package src.programmers.cesarpassword;

public class Solution {
    static public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            // UpperCase(65~90)
            if(arr[i] > 64 && arr[i] <91){
                int tmp = arr[i] - 65;
                tmp = ((tmp+n) % 26) + 65;
                arr[i] = (char) tmp;
            }
            // LowerCase(97~122)
            if(arr[i]>96 && arr[i]<123){
                int tmp = arr[i] - 97;
                tmp = ((tmp+n) % 26) + 97;
                arr[i] = (char) tmp;
            }
        }
        answer = new String(arr);

        return answer;
    }
}
