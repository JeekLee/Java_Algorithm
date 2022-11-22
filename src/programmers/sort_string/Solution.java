package src.programmers.sort_string;

import java.util.*;
import java.lang.*;

public class Solution {
    static class StringSet implements Comparable {
        // field
        int asci;
        String str;

        // constructor
        public StringSet(int asci, String str){
            this.asci = asci;
            this.str = str;
        }

        @Override
        public int compareTo(Object o) {
            StringSet s = (StringSet) o;
            if(this.asci>s.asci){
                return 1;
            }
            else if(this.asci<s.asci){
                return -1;
            }
            else{
                return str.compareTo(s.str);
            }
        }
    }

    static public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<StringSet> listarr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            listarr.add(new StringSet(strings[i].charAt(n), strings[i]));
        }
        Collections.sort(listarr);
        answer = new String[strings.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = listarr.get(i).str;
        }
        return answer;
    }
}
