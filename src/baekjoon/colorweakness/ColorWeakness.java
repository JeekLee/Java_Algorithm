package src.baekjoon.colorweakness;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10026

/*
input
 1.첫째 줄에 N이 주어진다. (1 ≤ N ≤ 100)
 2. 둘째 줄부터 N개 줄에는 그림이 주어진다.
output
 1. 적록색약이 아닌 사람이 봤을 때의 구역의 개수와 적록색약인 사람이 봤을 때의 구역의 수를 공백으로 구분해 출력한다.
 */

class UserGrid {
  // 필드
  int gridNumber;
  char[][] gridString_normal = null;
  char[][] gridString_weakness = null;
  int[][] gridInt_normal = null;
  int[][] gridInt_weakness = null;

  // 생성자
  public UserGrid(int number, char[][] array){
    gridNumber = number;

    gridString_normal = new char[number][number];
    gridString_weakness = new char[number][number];
    gridInt_normal = new int[number][number];
    gridInt_weakness = new int[number][number];

    for (int i = 0; i<number; i++){
      for (int j = 0; j<number ; j++){
        gridString_normal[i][j] = array[i][j];
        gridString_weakness[i][j] = array[i][j];
      }
    }
    for (int i = 0; i<number; i++){
      for (int j = 0; j<number ; j++){
        if (gridString_weakness[i][j] == 'G'){
          gridString_weakness[i][j] = 'R';
        }
      }
    }
  }

  public boolean checkRB(int x, int y, int[][] arrayInt, char[][] arrayChar, int tmp){

    boolean flag = false;

    // 해당 좌표가 0이 아닌 경우 false 리턴
    if (arrayInt[x][y] != 0){return false;}

    // 1. 숫자 넣기
    arrayInt[x][y] = tmp;
    // 2. 상,하,좌,우 같은 글자 있는지 확인 및 함수 호출. 없으면 false 리턴
    if (x+1 < gridNumber && arrayChar[x][y]==arrayChar[x+1][y]){
      if (arrayInt[x+1][y] == 0){
        // System.out.println("삽입");
        arrayInt[x+1][y] = tmp;
        flag = true;
      }
      else{
         arrayInt[x][y] = arrayInt[x+1][y];
      }
    }
    if (x-1 > -1 && arrayChar[x][y]==arrayChar[x-1][y]){
      if(arrayInt[x-1][y] == 0){
        // System.out.println("삽입");
        arrayInt[x-1][y] = tmp;
        flag = true;
      }
      else{
        arrayInt[x][y] = arrayInt[x-1][y];
      }
    }
    if (y+1 < gridNumber && arrayChar[x][y]==arrayChar[x][y+1]){
      if(arrayInt[x][y+1]==0){
        // System.out.println("삽입");
        arrayInt[x][y+1] = tmp;
        flag = true;
      }
      else{
        arrayInt[x][y] = arrayInt[x][y+1];
      }
    }
    if (y-1 > -1 && arrayChar[y][x]==arrayChar[x][y-1]){

      if(arrayInt[x][y-1]==0){
        // System.out.println("삽입");
        arrayInt[x][y-1] = tmp;
        flag = true;
      }
      else{
        arrayInt[y][x] = arrayInt[x][y-1];
      }
    }

    System.out.println("-----------");
    for (int i = 0; i<gridNumber; i++){
      for (int j = 0; j < gridNumber; j++){
        if (x==i && y==j){
          System.out.printf("*%d  ", arrayInt[i][j]);

        }
        else{
          System.out.printf(" %d  ", arrayInt[i][j]);
        }
      }
      System.out.printf("\n");
    }
    System.out.println("-----------");

    if (flag == true){
      return false;
    }
    else{
      return true;
    }

  }

  public int normal(){
    int areaNumber = 1;
    for (int i=0; i < gridNumber; i++){
      for (int j=0; j < gridNumber; j++){
        if(!checkRB(i, j, gridInt_normal, gridString_normal, areaNumber)){
           areaNumber++;
        }
      }
    }
    return areaNumber-1;
  }

  public int weakness(){
    return 1;
  }
}

public class ColorWeakness {
  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Grid의 크기를 입력하세요(X * X): ");
    int inputNumber = scanner.nextInt();
    scanner.nextLine(); // 버퍼 초기화

    char[][] inputString = new char[inputNumber][inputNumber];

    for (int i = 0; i < inputNumber; i++){
      String tmp = null;
      while (tmp == null){
        System.out.printf("%d번째 라인을 입력하세요: ", i+1);
        tmp = scanner.nextLine();

        if (tmp.length() != inputNumber){
          System.out.printf("설정한 Grid의 크기에 맞게 입력하세요(입력 값 : %d)\n", inputNumber);
          tmp = null;
        }
        else{
          for (int j = 0; j < inputNumber; j++){
            inputString[i][j] = tmp.charAt(j);
          }
          break;
        }
      }
    }

    UserGrid grid = new UserGrid(inputNumber, inputString);
    System.out.println(grid.normal());
  }
}
