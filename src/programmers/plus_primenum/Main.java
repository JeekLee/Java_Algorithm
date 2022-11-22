package src.programmers.plus_primenum;

import java.util.*;
import java.lang.*;

public class Main {
    boolean check_prime(int num) {
        // 1. n이 p*q로 표현될 때 한 수는 항상 n의 제곱근 이하, 다른 한 수는 제곱근 이상이다.
        // 2. n의 제곱근까지만 순회하면, 소수 여부를 판별할 수 있다.
        for(int i=2 ; i*i<=num; i++) {
            if(num%i ==0) {
                return false;
            }
        }
        return true;
    }
    String solution(String s){
        String answer = "";

        // String Array to Integer Array
        String[] strarr = s.split(" ");
        int[] arr = new int[strarr.length];
        for (int i = 0; i < strarr.length; i++) {
            arr[i] = Integer.parseInt(strarr[i]);
        }

        // Save numbers in lists
        List<Integer> list_prime = new ArrayList<>();
        List<Integer> list_notprime = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(check_prime(arr[i])){
                list_prime.add(arr[i]);
            }
            else {
                list_notprime.add(arr[i]);
            }
        }

        // using collection method
        answer = answer + Collections.min(list_notprime)+ " " + Collections.max(list_prime);
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "97 75 88 99 95 92 73";

        System.out.println(method.solution(s));
    }
}
