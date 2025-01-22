public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for(int i = 1; i<input.length; i++){
            int temp = input[i];
            int j = i - 1;

            while(j >= 0 && input[j] > key){
                input[j+1] = input[j];
                j--;
            }
            input[j-1] = temp;
        }
    }
}
