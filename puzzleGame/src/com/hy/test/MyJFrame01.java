package com.hy.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame01 implements ActionListener {

    JButton jbt1 = new JButton("1号按钮");
    JButton jbt2 = new JButton("2号按钮");
    public MyJFrame01() {
        JFrame jFrame = new JFrame();
//设置界面的宽高
        jFrame.setSize(603, 680);
//设置界面的标题
        jFrame.setTitle("事件演示");
//设置界面置顶
        jFrame.setAlwaysOnTop(true);
//设置界面居中
        jFrame.setLocationRelativeTo(null);
//设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//取消默认的居中放置，只有取消了才会按照xY轴的形式添加组件
        jFrame.setLayout(null);

//创建一个按钮对象
//设置宽高
        jbt1.setBounds(0, 0, 100, 50);
        jbt2.setBounds(0, 50, 100, 50);
//添加动作监听
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);

        jFrame.getContentPane().add(jbt1);
        jFrame.getContentPane().add(jbt2);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Random r = new Random();
        if (source == jbt1) {
            jbt1.setSize(r.nextInt(200) + 100,50);
        } else if (source == jbt2) {
            jbt2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }
}
