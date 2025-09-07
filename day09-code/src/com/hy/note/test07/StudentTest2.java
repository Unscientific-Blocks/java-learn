package com.hy.note.test07;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student(1, "张三", 23);
        Student s2 = new Student(2, "李四", 21);
        Student s3 = new Student(3, "王五", 24);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        int id = 3;
        int index = index(arr, id);
        if (index >= 0) {
            arr[index] = null;
            print(arr);
        } else {
            System.out.println("输入的ID不存在");
        }
    }

    public static int index(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null && student.getId() == id) {
                return i;
            }
        }
        return -1;
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
