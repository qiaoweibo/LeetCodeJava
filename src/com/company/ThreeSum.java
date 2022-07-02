package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
        for (List list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (nums[0] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    ans.add(list);
                    while (low < high && nums[low++] == nums[low]) {
                        ;
                    }
                    while (low < high && nums[high--] == nums[high]) {
                        ;
                    }
                }
                else if (sum > 0) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return ans;
    }
}
