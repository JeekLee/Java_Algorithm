package src.programmers.sort_string;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(Arrays.toString(Solution.solution(strings, n)));
    }
}
