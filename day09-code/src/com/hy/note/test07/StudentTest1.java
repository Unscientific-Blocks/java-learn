package com.hy.note.test07;

import java.util.Scanner;

public class StudentTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
        Student s1 = new Student(1, "张三", 23);
        Student s2 = new Student(2, "李四", 21);
        Student s3 = new Student(3, "王五", 24);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(4, "赵六", 26);
        boolean flag = exist(arr, s4);
        int count = count(arr);
        if (flag) {
            if (count < arr.length) {
//                原数组没满，在原数组内添加元素
                arr[count] = s4;
                print(arr);
            } else {
//                原数组已满，创建新数组，在新数组内添加元素
                Student[] newArr = getNewArr(arr);
                newArr[count] = s4;
                print(newArr);
            }
        } else {
            System.out.println("当前ID已存在");
        }

//      通过ID删除学生信息

    }

    private static Student[] getNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //判断ID是否存在
    public static boolean exist(Student[] arr, Student student) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null) {
                if (stu.getId() == student.getId()) {
                    return false;
                }
            }
        }
        return true;
    }

    //    判断原数组的长度
    public static int count(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static void print(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge());
            }
        }
    }
}
