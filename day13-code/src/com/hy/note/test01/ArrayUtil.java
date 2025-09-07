package com.hy.note.test01;

public class ArrayUtil {
//    工具类
//    1.类名见名知意
//    2.私有化构造方法
//    3/方法定义为静态
    private ArrayUtil() {}

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
