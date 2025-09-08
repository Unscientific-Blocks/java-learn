package com.hy.note.test02;

public class Test02 {
    public static void main(String[] args) {
        /*
        分块查找
        核心思想：
        块内无序，块间有序
        实现步骤：
        1.创建数组blockArr存放每一个块对象的信息
        2.先查找blockArr确定要查找的数据属于哪一块
        3.再单独遍历这一块数据即可
        */

        //1.要把数据进行分块
        //要分为几块：数组长度开根号
        int[] arr = {16, 5, 9, 12, 21, 18,
                     32, 23, 37, 26, 45, 34,
                     50, 48, 61, 52, 73, 66};

        //创建3个块的对象
        Block b1 = new Block(21, 0,5);
        Block b2 = new Block(45, 6,11);
        Block b3 = new Block(73, 12,17);

        //定义数组管理3个块对象 (索引表)
        Block[] blockArr = {b1,b2,b3};

        //定义一个变量用来记录要查找的元素
        int number = 45;

        //调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(blockArr, arr, number);
        System.out.println(index);


    }

    public static int getIndex(Block[] blockArr, int[] arr, int target) {
        for (int i = 0; i < blockArr.length; i++) {
            if (blockArr[i].getMax() >= target) {
                Block block = blockArr[i];
                for (int j = block.getStartIndex(); j <= block.getEndIndex(); j++) {
                    if (arr[j] == target) {
                        return j;
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
