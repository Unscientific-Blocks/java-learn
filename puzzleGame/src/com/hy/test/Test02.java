package com.hy.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test02 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
//设置界面的宽高
        jFrame.setSize(603,680);
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
        JButton jbt = new JButton("按钮");
//设置宽高
        jbt.setBounds(0,0,100,50);
//添加动作监听
        jbt.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("按钮已被点击");
                    }
                }
        );

        jFrame.getContentPane().add(jbt);

        jFrame.setVisible(true);
    }
}
