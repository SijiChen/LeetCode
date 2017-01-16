package FourEightFive485;

/**
 * Created by sjchen on 1/16/17.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
//
            if (nums[i] == 1 && nums[i - 1] == 1) {
                curr++;
                if (curr > count) count = curr;

            } else if (nums[i] == 1) {
                curr = 1;
            } else {
                if (curr > count) count = curr;
                curr = 0;
            }

        }
        if (curr > count) count = curr;
        return count;
    }
}