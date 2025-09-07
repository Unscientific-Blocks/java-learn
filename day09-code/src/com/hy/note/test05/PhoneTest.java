package com.hy.note.test05;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("三星", 6999, "琥珀黄");
        Phone p2 = new Phone("索尼", 5899, "黑");
        Phone p3 = new Phone("苹果", 8999, "蓝");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        double avg = sum / arr.length;

        System.out.println(avg);
    }
}
