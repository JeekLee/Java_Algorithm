package src.baekjoon.bertrand_postulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void solution(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int tmp = 0;
            for (int j = list.get(i) + 1; j <= 2*list.get(i); j++) {
                if(check_prime(j)){
                    tmp++;
                }
            }
            System.out.println(tmp);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp;
        List<Integer> list = new ArrayList<>();

        while((tmp = br.readLine()) != null){
            if (tmp.equals("0")){
                break;
            }
            int x = Integer.parseInt(tmp);
            list.add(x);
        }
        solution(list);
    }
    static boolean check_prime(int num) {
        // 1. n이 p*q로 표현될 때 한 수는 항상 n의 제곱근 이하, 다른 한 수는 제곱근 이상이다.
        // 2. n의 제곱근까지만 순회하면, 소수 여부를 판별할 수 있다.
        for(int i=2 ; i*i<=num; i++) {
            if(num%i ==0) {
                return false;
            }
        }
        return true;
    }
}
