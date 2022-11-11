package programmers.fruit_vender;

public class SortedArray {
    // field
    int[] array = null;
    int size;
    String type = null;

    // constructor
    public SortedArray(int[] passedArray, int passedSize){
        array = passedArray;
        size = passedSize;
    }
    // tools
    void Swap(int tmp1, int tmp2){
        int tmp = array[tmp1];
        array[tmp1] = array[tmp2];
        array[tmp2] = tmp;
    }

    public void SelectionSortA(){
        for (int i = 0; i<size ; i++){
            int min = i;
            for (int j = i+1; j<size; j++){
                if(array[min] >= array[j]){
                    min = j;
                }
            }
            if (i != min){
                Swap(i, min);
            }
        }
        type = "SelectionSorted_Ascending";
    }
    public void SelectionSortD(){
        long start = System.currentTimeMillis();
        for (int i = 0; i<size ; i++){
            int max = i;
            for (int j = i+1; j<size; j++){
                if(array[max] <= array[j]){
                    max = j;
                }
            }
            if (i != max){
                Swap(i, max);
            }
        }
        type = "SelectionSorted_Descending";
        long end = System.currentTimeMillis();
        System.out.println(type + " 실행 시간 : " + (end-start));
    }
    public void InsertionSortA(){
        for(int i = 0; i<size; i++){
            int j;
            int key = array[i];
            for(j = i-1; j>=0 && array[j]>key; j--){
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
        type = "InsertionSorted_Ascending";
    }
    public void InsertionSortD(){
        long start = System.currentTimeMillis();
        for(int i = 0; i<size; i++){
            int j;
            int key = array[i];
            for(j = i-1; j>=0 && array[j]<key; j--){
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
        type = "InsertionSorted_Ascending";
        long end = System.currentTimeMillis();
        System.out.println(type + " 실행 시간 : " + (end-start));
    }
}
