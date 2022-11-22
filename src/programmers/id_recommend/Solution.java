package src.programmers.id_recommend;

public class Solution {
    static public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        String answer = String.copyValueOf(new_id.toCharArray());

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (new_id.isEmpty()){
            answer = "a";
        }

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for (int i = 0; i < new_id.length(); i++) {
            char tmp = new_id.charAt(i);
            // 48 ~ 57가 숫자
            if (tmp < 48 || tmp > 57){
                if (tmp != 45 && tmp != 95 && tmp != 46){
                    if (!(tmp >96 && tmp < 123)){
                        answer = answer.replace(String.valueOf(tmp), "");
                    }
                }
            }
        }
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (answer.charAt(0)== '.'){

        }

//         6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//              만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//         7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        return answer;
    }
}
