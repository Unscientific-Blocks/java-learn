package com.hy.ui;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LoginJframe extends JFrame implements MouseListener {
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("zhangsan","123"));
        list.add(new User("lisi","1234"));
    }
    private JButton login = new JButton();
    private JButton register = new JButton();
    private JLabel codeJLabel = new JLabel();
    private String codeStr;
    private String passwordStr;
    private String usernameStr;
    private String inputCodeStr;
    private JTextField code = new JTextField();
    private JTextField username = new JTextField();
    private JTextField password = new JTextField();

    public LoginJframe() {
        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //让当前界面显示出来
        this.setVisible(true);
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzleGame/image/login/用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzleGame/image/login/密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzleGame/image/login/验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        codeStr = CodeUtil.getCode();

        //设置内容
        codeJLabel.setText(codeStr);
        //位置和宽高
        codeJLabel.setBounds(300, 256, 50, 30);
        codeJLabel.addMouseListener(this);
        //添加到界面
        this.getContentPane().add(codeJLabel);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("puzzleGame/image/login/登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);
        login.addMouseListener(this);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzleGame/image/login/注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);
        register.addMouseListener(this);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzleGame/image/login/background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }


    public void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }

    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    public void login() {
        int index = getUsernameIndex(usernameStr);
        if (index == -1) {
            showJDialog("用户名未注册");
            return;
        }
        if (!passwordStr.equals(list.get(index).getPassword())) {
            showJDialog("密码错误");
            return;
        }
        this.setVisible(false);
        GameJFrame frame = new GameJFrame();
    }

    public void register() {
        int index = getUsernameIndex(usernameStr);
        if (index != -1) {
            showJDialog("用户名已注册");
            return;
        }
        list.add(new User(usernameStr, passwordStr));
        showJDialog("注册成功");
    }

    public boolean judge() {
        inputCodeStr = code.getText();
        usernameStr = username.getText();
        passwordStr = password.getText();
        if (!inputCodeStr.equalsIgnoreCase(codeStr)) {
            showJDialog("验证码错误");
            return false;
        }
        if (usernameStr.length() == 0) {
            showJDialog("用户名不能为空");
            return false;
        }
        if (passwordStr.length() == 0) {
            showJDialog("密码不能为空");
            return false;
        }
        return true;
    }

    public void setInput() {
        code.setText(null);
        username.setText(null);
        password.setText(null);
        inputCodeStr = code.getText();
        usernameStr = username.getText();
        passwordStr = password.getText();
    }

    public void refreshCode() {
        codeStr = CodeUtil.getCode();
        codeJLabel.setText(codeStr);
        this.getContentPane().repaint();
    }

    public int getUsernameIndex(String usernameStr) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("usernameStr  " + usernameStr);
            System.out.println("list.get(i).getUsername()  " + list.get(i).getUsername());
            if (usernameStr.equals(list.get(i).getUsername())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == codeJLabel) {
            refreshCode();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("puzzleGame/image/login/登录按下.png"));
            //去除按钮的默认边框
            login.setBorderPainted(false);
            //去除按钮的默认背景
            login.setContentAreaFilled(false);
            this.getContentPane().repaint();
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzleGame/image/login/注册按下.png"));
            //去除按钮的默认边框
            register.setBorderPainted(false);
            //去除按钮的默认背景
            register.setContentAreaFilled(false);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("puzzleGame/image/login/登录按钮.png"));
            //去除按钮的默认边框
            login.setBorderPainted(false);
            //去除按钮的默认背景
            login.setContentAreaFilled(false);
            this.getContentPane().repaint();
            if (judge()) {
                login();
                setInput();
            }
            refreshCode();
        }  else if (source == register) {
            register.setIcon(new ImageIcon("puzzleGame/image/login/注册按钮.png"));
            //去除按钮的默认边框
            register.setBorderPainted(false);
            //去除按钮的默认背景
            register.setContentAreaFilled(false);
            this.getContentPane().repaint();
            if (judge()) {
                register();
                setInput();
            }
            refreshCode();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
