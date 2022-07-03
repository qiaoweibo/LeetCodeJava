package com.company;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, 4};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; ++i) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int tmp = nums[i] + nums[low] + nums[high];
                if (Math.abs(tmp - target) < Math.abs(sum - target)) {
                    sum = tmp;
                }
                if (tmp == target) {
                    return sum;
                }
                else if (tmp > target) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return sum;
    }
}
