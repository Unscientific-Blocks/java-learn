package com.hy.finalExam.topic09;

public class Test {
    public static void main(String[] args) {
//        9.其实我们可以通过父母的身高大致推断出子女的身高，
//        假定父母与子女的身高遗传关系如下:
//          儿子身高(厘米) = (父亲身高 + 母亲身高) * 1.08 / 2
//          女儿身高(厘米) = (父亲身高 * 0.923 + 母亲身高) / 2
//        那已知:现有父亲身高 175 CM, 母亲身高 160 CM
//        请将预测的子女身高打印输出
        double father = 175;
        double mother = 160;
        double son = (father + mother) * 1.08 / 2;
        double daughter = (father * 0.923 + mother) / 2;
        System.out.println("儿子预测身高:" + son + "cm");
        System.out.println("女儿预测身高:" + daughter + "cm");
    }
}
