package com.hank;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hank
 * @date 2022-08-29 14:49
 */
public class BinarySearch {

    public static int binarySearch(int[] items, int item) {
        // 先将items按从小到大的顺序排序
        // quickSort(items);

        int min = 0, max = items.length - 1, mid;

        while (min <= max) {
            mid = (min + max) >> 1;
//            mid = (int) Math.floor((min + max) >> 1);
            if (items[mid] < item) {
                min = mid + 1;
            } else if (items[mid] == item) {
                return mid;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] items = {1, 3, 5, 6, 8, 10, 21, 26};
        int i = binarySearch(items, 10);
        System.out.println(i);
    }

}

