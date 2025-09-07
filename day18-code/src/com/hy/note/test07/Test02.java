package com.hy.note.test07;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test02 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal val)                       加法
        public BigDecimal subtract(BigDecimal val)                  减法
        public BigDecimal multiply(BigDecimal val)                  乘法
        public BigDecimal divide(BigDecimal val)                    除法
        public BigDecimal divide(BigDecimal val, 精确几位, 舍入模式)  除法
         */

        //1.加法
        //BigDecimal bd1 = new BigDecimal("0.01");
        //BigDecimal bd2 = new BigDecimal("0.02");
        //BigDecimal bd3 = bd1.add(bd2);
        //System.out.println(bd3);

        //减法
        //BigDecimal bd4 = new BigDecimal("0.05");
        //BigDecimal bd5 = new BigDecimal("-0.1");
        //BigDecimal bd6 = bd5.subtract(bd4);
        //System.out.println(bd6);

        //乘法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(7.0);
        BigDecimal bd3 = bd1.multiply(bd2);
        //System.out.println(bd3);

        //除法
        BigDecimal bd4 = bd1.divide(bd2, 11, RoundingMode.HALF_UP);
        System.out.println(bd4);


    }
}
