package com.hy.note.test07;

public class Test {
    public static void main(String[] args) {
        PingPongPlayer pingPongPlayer = new PingPongPlayer(28, "张三");
        BasketballPlayer basketballPlayer = new BasketballPlayer(24, "李四");
        PingPongCoach pingPongCoach = new PingPongCoach(48, "王五");
        BasketballCoach basketballCoach = new BasketballCoach(54, "赵六");
        pingPongPlayer.learn();
        pingPongPlayer.learnEnglish();
        basketballPlayer.learn();
        pingPongCoach.teach();
        pingPongCoach.learnEnglish();
        basketballCoach.teach();
    }
}
