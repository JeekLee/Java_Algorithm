package src.programmers.descending_sort;

public class Solution {

    // 삽입정렬
    static public int[] InsertionSortD(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int key = arr[i];
            int j;
            for(j = i-1; j>=0 && arr[j]<key; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }

    static public long solution(long n) {
        long answer = 0;
        int tmp[] = new int[(int) Math.log10(n) + 1]; // 로그를 통해 자릿 수 구하고, 그 크기에 해당하는 배열 생성
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int) (n % 10);
            n = n / 10;
        }
        tmp = InsertionSortD(tmp);
        for (int i = 0; i < tmp.length; i++) {
            answer = answer*10 + tmp[i];
        }
        return answer;
    }
}
