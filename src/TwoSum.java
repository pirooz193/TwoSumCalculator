import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public List<int[]> calculateTwoSums(int[] nums, int target) {
        List<int[]> results = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                results.add(new int[]{nums[left], nums[right]});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {0, 1, 3, 4, 5, 6, 8, 9};
        int target = 10;
        List<int[]> result = twoSum.calculateTwoSums(nums, target);

        if (result.isEmpty()) {
            System.out.println("No two sum solutions found.");
        } else {
            System.out.println("Possible pairs of numbers :");
            for (int[] pair : result) {
                System.out.println("[" + pair[0] + ", " + pair[1] + "]");
            }
        }
    }
}
