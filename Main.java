public class Main {
    public static void main(String[] args)
    {

        int[] testInput = randomArray();

        TestSuite.run(testInput, 10000);
    }

    public static int[] randomArray(){
        int ran = (int) (Math.random() * 98 + 2);
        int[] nums = new int[ran];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random() * 100);
        }
        return nums;
    }
}
