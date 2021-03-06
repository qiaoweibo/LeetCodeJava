package com.company;

/**
 * @author QiaoWeiBo
 * @date 2022/7/9 2:33 PM
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        nums = sortArray(nums);
        for (int c : nums) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static int onceSort(int[] nums, int low, int high) {
        int key = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= key) {
                high--;
            }
            if (low < high) {
                nums[low] = nums[high];
            }
            while (low < high && nums[low] <= key) {
                low++;
            }
            if (low < high) {
                nums[high] = nums[low];
            }
        }
        nums[low] = key;
        return low;
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = onceSort(nums, low, high);
        quickSort(nums, low, mid - 1);
        quickSort(nums, mid + 1, high);
    }

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}
