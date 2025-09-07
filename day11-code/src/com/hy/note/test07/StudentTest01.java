package com.hy.note.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        loop: while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            String n = sc.next();
            switch (n) {
                case "1" -> addStudent(students);
                case "2" -> deleteStudents(students);
                case "3" -> updateStudents(students);
                case "4" -> selectStudents(students);
                case "5" -> {
                    break loop;
                }
                default -> System.out.println("输入错误,请重新输入");
            }
        }
    }

    public static int Exist(ArrayList<Student> students, String addId) {
        for (int i = 0; i < students.size(); i++) {
           if (students.get(i).getId().equals(addId)) {
               return i;
           }
        }
        return -1;
    }

    public static void addStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            System.out.println("请输入学生的id:");
            String addId = sc.next();
            if (Exist(students, addId) != -1) {
                System.out.println("添加失败，该id已存在");
            } else {
                student.setId(addId);
                break;
            }
        }
        System.out.println("请输入学生的姓名:");
        student.setName(sc.next());
        System.out.println("请输入学生的年龄:");
        student.setAge(sc.nextInt());
        System.out.println("请输入学生的地址:");
        student.setAddress(sc.next());
        students.add(student);
        System.out.println("添加成功");
    }

    public static void deleteStudents(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id:");
        String delId = sc.next();
        if (Exist(students, delId) != -1) {
            students.remove(Exist(students, delId));
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败，该id不存在");
        }
    }

    public static void updateStudents(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id:");
        String updateId = sc.next();
        if (Exist(students, updateId) != -1) {
            Student student = students.get(Exist(students, updateId));
            System.out.println("请输入修改后学生的姓名:");
            student.setName(sc.next());
            System.out.println("请输入修改后学生的年龄:");
            student.setAge(sc.nextInt());
            System.out.println("请输入修改后学生的地址:");
            student.setAddress(sc.next());
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败，该id不存在");
        }
    }

    public static void selectStudents(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
            for (int i = 0; i < students.size(); i++) {
                System.out.print(students.get(i).getId() + "\t\t" + students.get(i).getName() + "\t\t" + students.get(i).getAge() + "\t\t" + students.get(i).getAddress());
                System.out.println();
            }
        }
    }
}
