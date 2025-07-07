import java.util.Arrays;

public class TwoPointers {

    public static void main(String[] args) {
//        int[] numbers = {2,7,11,15};
//        int target = 9;
        int[] numbers = {-1,0};
        int target = -1;
        TwoSum_167 task167 = new TwoSum_167();
        System.out.println(Arrays.toString(task167.twoSum(numbers, target)));
    }
}
