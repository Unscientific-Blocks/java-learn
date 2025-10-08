package com.hy.note.set;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private int score;
    private int chinese;
    private int math;
    private int english;


    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        setScore();
    }

    public int getScore() {
        return score;
    }

    private void setScore() {
        this.score = this.chinese + this.math + this.english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
        setScore();
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
        setScore();
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
        setScore();
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    /*
    按照总分从高到低输出到控制台
    如果总分一样，按照语文成绩排
    如果语文一样，按照数学成绩排
    如果数学成绩一样，按照英语成绩排
    如果英文成绩一样，按照年龄排
    如果年龄一样，按照姓名的字母顺序排
    如果都一样，认为是同一个学生，不存。
     */
    @Override
    public int compareTo(Student2 o) {
        int result = o.getScore() - this.getScore();
        result = result == 0 ? o.getChinese() - this.getChinese() : result;
        result = result == 0 ? o.getMath() - this.getMath() : result;
        result = result == 0 ? o.getEnglish() - this.getEnglish() : result;
        result = result == 0 ? o.getAge() - this.getAge() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
