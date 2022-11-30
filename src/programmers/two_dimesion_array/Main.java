package src.programmers.two_dimesion_array;
public class Main {
    public boolean checkCondition(int[][] arr, int i, int j){
        boolean flag = true;

        if (i-1 >= 0 && arr[i-1][j] >= arr[i][j]){
            flag = false;
        }
        if (j-1 >= 0 && arr[i][j-1] >= arr[i][j]){
            flag = false;
        }
        if (i+1 <= arr.length - 1 && arr[i+1][j] >= arr[i][j]){
            flag = false;
        }
        if (j+1 <= arr.length - 1 && arr[i][j+1] >= arr[i][j]){
            flag = false;
        }
        return flag;
    }

    public void solution(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                String tmp;
                if(checkCondition(arr1, i, j)){
                    tmp = "*";
                }
                else{
                    tmp = Integer.toString(arr1[i][j]);
                }
                System.out.print(tmp + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};

        method.solution(arr1);
    }
}
// 26m
