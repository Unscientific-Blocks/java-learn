package com.hy.note.test04;

public class Test01 {
    public static void main(String[] args) {
        /*
        public static Runtime getRuntime()当前系统的运行环境对象
        public void exit(int status)停止虚拟机
        public int availableProcessors()获得CPU的线程数
        public long maxMemory()JVM能从系统中获取总内存大小（单位byte）
        public long totalMemory()JVM已经从系统中获取总内存大小（单位byte）
        public long freeMemory()JVM剩余内存大小（单位byte）
        public Process exec(String command)运行cmd命令
         */

        Runtime r1 = Runtime.getRuntime();
        System.out.println(r1.availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "MB");
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");
    }
}
