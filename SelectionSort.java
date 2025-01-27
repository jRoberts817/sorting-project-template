public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        int temp;
        int ind = 0;
        int fin = Integer.MAX_VALUE;
        for(int i = 0; i<input.length-1; i++){
            fin = Integer.MAX_VALUE;
            for(int j = i; j<input.length; j++){
                temp = input[j];
                if(temp<fin){
                    fin = temp;
                    ind = j;
                }
            }
            input[ind] = input[i];
            input[i] = fin;
            
        }
    }
}
