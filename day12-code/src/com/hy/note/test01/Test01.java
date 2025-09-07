package com.hy.note.test01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        boolean flag = false;
        while (!flag) {
            flag = false;
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作 1登录 2注册 3忘记密码");
            switch (sc.next()) {
                case "1" -> flag = login(users);
                case "2" -> register(users);
                case "3" -> forgetPassword(users);
                default -> System.out.println("输入错误,请重新输入");
            }
            if (flag) {
                System.out.println("登录成功");
                while (flag) {
                    System.out.println("-------------欢迎来到学生管理系统----------------");
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
                        case "5" -> flag = false;
                        default -> System.out.println("输入错误,请重新输入");
                    }
                }
            }
        }
    }

    public static boolean login(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.next();
        if (usernameIndex(users, username) == -1) {
            System.out.println("用户名未注册,请先注册");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码(剩余" + (3 - i) + "次机会):");
            if (users.get(usernameIndex(users, username)).getPassword().equals(sc.next())) {
                System.out.println("密码正确");
                break;
            }
            if (i == 2) {
                System.out.println("密码已连续3次输入错误");
                return false;
            }
        }
        String verificationCode1 = new String(verificationCode());
        System.out.println(verificationCode1);
        System.out.println("请输入验证码:");
        String verificationCode2 = sc.next();
        if (verificationCode1.equals(verificationCode2)) {
            System.out.println("验证码正确");
            return true;
        } else {
            System.out.println("验证码错误");
            return false;
        }
    }

    public static void register(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        String username;
        do {
            System.out.println("请输入用户名:");
            username = sc.next();
        } while (verifyUsername(users, username));
        String password;
        while (true) {
            System.out.println("请输入密码:");
            String password1 = sc.next();
            System.out.println("请再次输入密码:");
            String password2 = sc.next();
            if (password2.equals(password1)) {
                password = password2;
                break;
            } else {
                System.out.println("两次输入的密码不一致,请重新输入");
            }
        }
        String idNumber;
        do {
            System.out.println("请输入身份证号:");
            idNumber = sc.next();
        } while (verifyIdNumber(idNumber));
        String phoneNumber;
        do {
            System.out.println("请输入手机号:");
            phoneNumber = sc.next();
        } while (verifyPhoneNumber(phoneNumber));
        System.out.println("注册成功");
        User user = new User(username, password, idNumber, phoneNumber);
        users.add(user);
    }

    public static void forgetPassword(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.next();
        int index = usernameIndex(users, username);
        if (index == -1) {
            System.out.println("该用户名不存在");
            return;
        }
        System.out.println("请输入身份证号码:");
        String idNumber = sc.next();
        if (!users.get(index).getIdNumber().equals(idNumber)) {
            System.out.println("身份证号码错误,修改失败");
            return;
        }
        System.out.println("请输入手机号码:");
        String phoneNumber = sc.next();
        if (!users.get(index).getPhoneNumber().equals(phoneNumber)) {
            System.out.println("手机号码错误,修改失败");
            return;
        }
        while (true) {
            System.out.println("请输入新密码:");
            String password = sc.next();
            System.out.println("请再次输入密码");
            if (!password.equals(sc.next())) {
                System.out.println("两次输入的密码不一致,请重新输入");
            } else {
                users.get(index).setPassword(password);
                System.out.println("修改成功");
                break;
            }
        }
    }

    public static boolean verifyUsername(ArrayList<User> users, String username) {
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("用户名长度必须在3~15位之间,请重新输入");
            return true;
        }
        int countNum = 0;
        for (int i = 0; i < username.length(); i++) {
            boolean flag = (username.charAt(i) >= '0' && username.charAt(i) <= '9');
            if (!flag && !(username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') && !(username.charAt(i) >= 'a' && username.charAt(i) <= 'z')) {
                System.out.println("用户名只能是字母加数字的组合,请重新输入");
                return true;
            }
            if (flag) countNum++;
        }
        if (countNum == username.length()) {
            System.out.println("用户名不能是纯数字,请重新输入");
            return true;
        }
        if (usernameIndex(users, username) != -1) {
            System.out.println("该用户名已存在,请重新输入");
            return true;
        }
        return false;
    }

    private static int usernameIndex(ArrayList<User> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean verifyIdNumber(String idNumber) {
        if (idNumber.length() != 18) {
            System.out.println("身份证号码长度为18位,请重新输入");
            return true;
        }
        for (int i = 0; i < idNumber.length() - 1; i++) {
            if (idNumber.charAt(i) < '0' || idNumber.charAt(i) > '9') {
                System.out.println("身份证号码前17位必须都是数字,请重新输入");
                return true;
            }
        }
        if (idNumber.charAt(0) == '0') {
            System.out.println("身份证号码不能以0为开头,请重新输入");
            return true;
        }
        boolean flag1 = (idNumber.charAt(idNumber.length() - 1) != 'X');
        boolean flag2 = (idNumber.charAt(idNumber.length() - 1) != 'x');
        boolean flag3 = (idNumber.charAt(idNumber.length() - 1) < '0' && idNumber.charAt(idNumber.length() - 1) > '9');
        if (flag1 && flag2 && flag3) {
            System.out.println("身份证号码最为一位必须是数字,大写X或小写x,请重新输入");
            return true;
        }
        return false;
    }

    public static boolean verifyPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            System.out.println("手机号长度为11位,请重新输入");
            return true;
        }
        if (phoneNumber.charAt(0) == '0') {
            System.out.println("手机号不能以0为开头");
            return true;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                System.out.println("手机号必须都是数字,请重新输入");
                return true;
            }
        }
        return false;
    }

    public static char[] verificationCode() {
        Random r = new Random();
        char[] verificationCode = new char[5];
        for (int i = 0; i < verificationCode.length - 1; i++) {
            int index = r.nextInt(52);
            if (index < 26) {
                verificationCode[i] = (char) (index + 'a');
            } else {
                verificationCode[i] = (char) (index - 26 + 'A');
            }
        }
        int num = r.nextInt(10);
        verificationCode[verificationCode.length - 1] = (char) (num + '0');
        for (int i = 0; i < verificationCode.length; i++) {
            int index = r.nextInt(verificationCode.length);
            char temp = verificationCode[i];
            verificationCode[i] = verificationCode[index];
            verificationCode[index] = temp;
        }
        return verificationCode;
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
