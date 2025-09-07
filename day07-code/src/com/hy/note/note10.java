package com.hy.note;

public class note10 {
    public static void main(String[] args) {
//        二维数组的静态初始化
//        格式：
//        数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1,元素2}};
        int[][] arr = new int[][] {{11,22},{33,44}};
//        简化格式:
//        数据类型[][] 数组名 = {{元素1,元素2},{元素1,元素2}};
        int[][] brr = {{11,22},{33,44}};


        int[][] arr1 = {
                {1,2,3,4},
                {4,5,6,7}
        };
//        arr1[0] 表示二维数组中的第一个一维 !数组!
//        arr1[0][0] 表示二维数组中的第一个一维数组中0索引的元素



//        遍历二维数组中的每一个元素
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
