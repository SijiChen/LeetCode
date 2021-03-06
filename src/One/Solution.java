package One;

import java.util.*;

/**
 * Created by sjchen on 1/13/17.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i ;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i );
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums= {2,7,11,15};
        System.out.println(Arrays.toString(solution.twoSum(nums,9)));
    }
}