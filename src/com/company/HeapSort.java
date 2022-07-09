package com.company;

/**
 * @author QiaoWeiBo
 * @date 2022/7/10 12:22 AM
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {1, 6, 4, 5, 2, 9, 7, 23, 56, 43, 99};
        sortArray(nums);
        for (int a : nums) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] nums) {
        heapSort(nums, nums.length);
        return nums;
    }

    public static void heapSort(int[] nums, int len) {
        for (int i = len / 2 - 1; i >= 0; --i) {
            adjust(nums, len, i);
        }
        for (int i = len - 1; i >= 0; --i) {
            swap(nums, 0, i);
            adjust(nums, i, 0);
        }
    }

    public static void adjust(int[] nums, int len, int index) {
        int i = 2 * index + 1;
        int j = 2 * index + 2;
        int maxIndex = index;
        if (i < len && nums[i] > nums[maxIndex]) {
            maxIndex = i;
        }
        if (j < len && nums[j] > nums[maxIndex]) {
            maxIndex = j;
        }
        if (maxIndex != index) {
            swap(nums, maxIndex, index);
            adjust(nums, len, maxIndex);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
