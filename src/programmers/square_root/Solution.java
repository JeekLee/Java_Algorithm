package src.programmers.square_root;

public class Solution {
    static public long solution(long n) {
        long answer = 0;
        double tmp = Math.sqrt(n);
        if(tmp%1 == 0){
            return (long)((tmp+1) * (tmp+1));
        }
        else{
            return -1;
        }
    }
}
