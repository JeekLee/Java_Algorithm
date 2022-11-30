package src.programmers.yutnori;

public class Main {
    public String solution(int[] arr1) {
        String answer = "";
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        switch (sum){
            case 0:
                answer = "윷";
                break;
            case 1:
                answer = "걸";
                break;
            case 2:
                answer = "개";
                break;
            case 3:
                answer = "도";
                break;
            case 4:
                answer = "모";
                break;
            default:
                answer = "올바른 입력값이 아닙니다.";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {0,1,0,0};
        System.out.println(method.solution(arr1));
    }
}
