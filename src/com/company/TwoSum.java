package com.company;

import java.util.*;

/**
 * @author QiaoWeiBo
 * @date 2022/7/9 12:30 AM
 */
public class TwoSum {
    public static void main(String[] args) {
        /**
         * 创建Scanner对象，接受从控制台输入
         * int[] nums = {2, 7, 11, 15};//普通数组的声明
         * @author QiaoWeiBo
         * @date 2022/7/9 12:31 AM
         */
        Scanner input = new Scanner(System.in);
        int[] nums = {2, 7, 11, 15};
        int[] numsTwo = twoSum(nums, 9);
        for (int i = 0; i < numsTwo.length; ++i) {
            System.out.print(numsTwo[i] + " ");
        }

        //下面是动态数组的测试
        List<Integer> list = new ArrayList<>();
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            int m = input.nextInt();
            list.add(m);
        }
        for (Integer c : list) {
            System.out.println(c);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // HashMap<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> hashMap = new HashMap<>(0);
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
