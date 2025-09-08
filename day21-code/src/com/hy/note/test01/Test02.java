package com.hy.note.test01;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        //课堂练习1：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复

        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        //System.out.println(searchIndex1(arr, 7 ));

        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素是否重复

        int[] arr1 = {131, 127, 147, 81, 103, 23, 7, 79, 131, 127, 79};
        ArrayList<Integer> result = searchIndex2(arr1, 131);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static int searchIndex1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> searchIndex2(int[] arr, int target) {
        /*
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                length++;
            }
        }
        if (length == 0) return new int[]{-1};
        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result[index++] = i;
            }
        }
        return result;
        */

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
}
