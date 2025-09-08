package com.hy.note.test02;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                   //00  01  02  03  04
                     13, 19, 16, 20,
                   //05  06  07  08
                     7, 10,
                   //09 10
                     43, 50, 48};
                   //11  12  13
        Block1 b1 = new Block1(40, 22, 0, 4);
        Block1 b2 = new Block1(20, 13, 5, 8);
        Block1 b3 = new Block1(10, 7, 9, 10);
        Block1 b4 = new Block1(50, 43, 11, 13);
        Block1[] block1s = {b1, b2, b3, b4};

        int target = 40;
        System.out.println(getIndex(block1s, arr, target));
    }

    public static int getIndex(Block1[] block1s, int[] arr, int target) {
        int index = getBlock(block1s, target);
        if (index == -1) {
            return -1;
        }
        int startIndex = block1s[index].startIndex;
        int endIndex = block1s[index].endIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int getBlock(Block1[] block1s, int target) {
        for (int i = 0; i < block1s.length; i++) {
            if (target >= block1s[i].getMin() && target <= block1s[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block1 {
    public int max;
    public int min;
    public int startIndex;
    public int endIndex;

    public Block1() {
    }

    public Block1(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
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
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
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
        return "Block1{max = " + max + ", min = " + min + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}

