package twopointers;

public class TwoSum_167 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if (numbers[left] + numbers[right] == target){
                return new int[]{left,right};
            }
            if (numbers[left] + numbers[right] < target){
                left++;
            } else if (numbers[left] + numbers[right] > target){
                right--;
            }
        }
        return null;
    }
}
