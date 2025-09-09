package com.hy.note.test03;

import com.hy.note.ArrUtil;

public class Test03 {
    public static void main(String[] args) {
        /*
        插入排序：
            将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
            遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
            N的范围：0~最大索引
         */

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arr);
        ArrUtil.printArr(arr);
    }

    public static void sort(int[] arr) {
        //1.找到无序数据的起始索引
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        if (startIndex == -1) {
            return;
        }
        System.out.println(startIndex);
        //2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //把遍历到的元素 arr[i] 插入的有序序列中
            //从大到小遍历有序序列
            //1,3,4,2,5     startIndex = 3      arr[i] = 2
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
