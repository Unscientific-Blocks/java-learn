package com.hy.note.test04;

public class Test08 {
    public static void main(String[] args) {
        String talk = "你做的很好,以后不要在做了,BBB,AAA,CCC";
        String[] lexicon = {"AAA", "BBB", "CCC", "DDD"};
        for (int i = 0; i < lexicon.length; i++) {
            talk = talk.replace(lexicon[i], "***");
        }
        System.out.println(talk);
    }
}
