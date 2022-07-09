package com.company;

/**
 * @author QiaoWeiBo
 * @date 2022/7/10 12:00 AM
 */
public class MergeSort {
   public static void main(String[] args) {
       int[] nums = {1, 6, 4, 5, 2, 9, 7, 23, 56, 43, 99};
       sortArray(nums);
       for (int a : nums) {
           System.out.print(a + " ");
       }
       System.out.println();
   }

    public static void Merge(int[] nums, int lowOne, int highOne, int lowTwo, int highTwo) {
        int i = lowOne;
        int j = lowTwo;
        int k = 0;
        int[] tmp = new int[highTwo - lowOne + 1];
        while (i <= highOne && j <= highTwo) {
            if (nums[i] < nums[j]) {
                tmp[k++] = nums[i++];
            }
            else {
                tmp[k++] = nums[j++];
            }
        }
        while (i <= highOne) {
            tmp[k++] = nums[i++];
        }
        while (j <= highTwo) {
            tmp[k++] = nums[j++];
        }
        for (int m = 0; m < k; ++m) {
            nums[lowOne + m] = tmp[m];
        }
    }

    public static void MergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (high - low) / 2 + low;
        MergeSort(nums, low, mid);
        MergeSort(nums, mid + 1, high);
        Merge(nums, low, mid, mid + 1, high);
    }

    public static int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
