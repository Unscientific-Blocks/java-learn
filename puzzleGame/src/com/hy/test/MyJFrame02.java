package com.hy.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame02 extends JFrame implements MouseListener {
    JButton jbt1 = new JButton("1号按钮");

    public MyJFrame02() {
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

        jbt1.setBounds(0,0,100,50);
        jbt1.addMouseListener(this);

        this.getContentPane().add(jbt1);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
