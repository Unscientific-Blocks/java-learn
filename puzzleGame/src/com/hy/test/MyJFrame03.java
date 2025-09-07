package com.hy.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame03 extends JFrame implements KeyListener {
    public MyJFrame03() {
//设置界面的宽高
        this.setSize(603, 680);
//设置界面的标题
        this.setTitle("事件演示");
//设置界面置顶
        this.setAlwaysOnTop(true);
//设置界面居中
        this.setLocationRelativeTo(null);
//设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//取消默认的居中放置，只有取消了才会按照xY轴的形式添加组件
        this.setLayout(null);
//给整个窗体添加键盘监听
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_A) {
            System.out.println("A");
        }
    }
}
