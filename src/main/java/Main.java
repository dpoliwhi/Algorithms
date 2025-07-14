import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        task167();
//        task344();
//        task1();
//        task27();
        task28();
    }

    private static void task167() {
//        int[] numbers = {2, 7, 11, 15};
//        int target = 9;
        int[] numbers = {-1, 0};
        int target = -1;
        TwoSum_167 task167 = new TwoSum_167();
        System.out.println(Arrays.toString(task167.twoSum(numbers, target)));
    }

    private static void task344() {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        ReverseString_344 task344 = new ReverseString_344();
        task344.reverseString(s);
    }

    private static void task1() {
        int[] nums = {3,2,4};
        int target = 6;
        TwoSum_1 task1 = new TwoSum_1();
        System.out.println(Arrays.toString(task1.twoSum(nums, target)));
    }

    private static void task27() {
//        int[] nums = {3,2,2,3};
//        int target = 3;
//        int[] nums = {0,1,2,2,3,0,4,2};
//        int target = 2;
        int[] nums = {1};
        int target = 1;
        RemoveElements_27 task27 = new RemoveElements_27();
        System.out.println(task27.removeElement(nums, target));
    }

    private static void task28() {
//        String first = "sadbutsad";
//        String second = "sad";
//        String first = "sad";
//        String second = "sad";
//        String first = "leetcode";
//        String second = "leeto";
        String first = "mississippi";
        String second = "issip";

        TwoPointers_28 task28 = new TwoPointers_28();
        System.out.println(task28.strStr(first, second));
    }
}
