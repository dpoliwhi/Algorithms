import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int dif =  target - numbers[i];
            if (map.containsKey(dif)) {
                return new int[]{map.get(dif), i};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
