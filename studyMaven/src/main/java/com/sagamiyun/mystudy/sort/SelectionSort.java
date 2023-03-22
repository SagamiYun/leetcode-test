package com.sagamiyun.mystudy.sort;

/**
 * 选择排序
 * */

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        if (arr == null ||  arr.length < 2) {
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = 0; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
