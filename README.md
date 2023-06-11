# TwoSumCalculator

This code implements the TwoSum algorithm to find pairs of numbers in an array that sum up to a given target value. The algorithm assumes that the input array `nums` is sorted in ascending order.

## Algorithm Explanation

1. Initialize an empty `results` list to store the pairs of numbers.
2. Set the `left` pointer to the first element of the array (`nums[0]`) and the `right` pointer to the last element (`nums[nums.length - 1]`).
3. Enter a loop that continues as long as `left` is less than `right`.
4. Calculate the sum of the numbers at indices `left` and `right`: `sum = nums[left] + nums[right]`.
5. If the sum is equal to the target:
   - Add the pair `[nums[left], nums[right]]` to the `results` list.
   - Increment `left` by 1 to move to the next possible left element.
   - Decrement `right` by 1 to move to the next possible right element.
6. If the sum is less than the target, increment `left` by 1 to try a larger number.
7. If the sum is greater than the target, decrement `right` by 1 to try a smaller number.
8. Repeat steps 4-7 until `left` becomes greater than or equal to `right`, indicating that all possible pairs have been checked.
9. Return the `results` list containing the pairs of numbers that sum up to the target.

## Example Usage

```java
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
```



In this example, the code creates an instance of the TwoSum class and calls the calculateTwoSums method with an array nums containing [0, 1, 3, 4, 5, 6, 8, 9] and a target value of 10. The result is stored in the result list.

If the result list is empty, it prints "No two sum solutions found." Otherwise, it iterates over each pair in the result list and prints them in the format [num1, num2].
## Complexity Analysis

- Time Complexity: O(N)



## Note

The code assumes that the input array nums is sorted in ascending order. If the array is not sorted, the algorithm may produce incorrect results.
