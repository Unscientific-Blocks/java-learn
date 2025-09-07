package com.hy.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener, MouseListener {
    int[][] arr = new int[4][4];
    private int x = 0;
    private int y = 0;
    private String path = "puzzleGame/image/animal/animal3/";
    private int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int step = 0;
    private JMenuItem replayItem = new JMenuItem("重新游戏");
    private JMenuItem reLoginItem = new JMenuItem("重新登陆");
    private JMenuItem closeItem = new JMenuItem("关闭游戏");
    private JMenuItem girl = new JMenuItem("女孩");
    private JMenuItem animal = new JMenuItem("动物");
    private JMenuItem sport = new JMenuItem("运动");
    private JMenuItem accountItem = new JMenuItem("二维码");
    private JLabel[] jLabels = new JLabel[16];
    private final int LEFT = 1;
    private final int RIGHT = 2;
    private final int UP = 3;
    private final int DOWN = 4;


    public GameJFrame() {
//        初始化界面
        initJFrame();
//        初始化菜单
        initJMenubar();

//        初始化数据
        initData();

//        初始化图片
        initImage();

//        显示出来,写在最后
        this.setVisible(true);
    }

    private void initData() {
        Random r = new Random();
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[index];
            tempArr[index] = tempArr[i];
            tempArr[i] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            arr[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利的图标
            JLabel winJLabel = new JLabel(new ImageIcon("puzzleGame/image/win.png"));
            winJLabel.setBounds(203, 283, 197,73);
            this.getContentPane().add(winJLabel);
            this.getContentPane().repaint();
        }

        JLabel stepCount = new JLabel("step" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);


        for (int i = 0; i < 16; i++) {
            int index = arr[i / 4][i % 4];
            jLabels[i] = new JLabel(new ImageIcon(path + index +".jpg"));
            jLabels[i].setBounds(105 * (i % 4) + 83, 105 * (i / 4) + 134, 105, 105);
            jLabels[i].setBorder(new BevelBorder(BevelBorder.LOWERED));
            jLabels[i].addMouseListener(this);
            this.getContentPane().add(jLabels[i]);
        }

        ImageIcon bg = new ImageIcon("puzzleGame/image/background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40,40,bg.getIconWidth(),bg.getIconHeight());
        this.getContentPane().add(background);
        this.getContentPane().repaint();
    }

    private void initJMenubar() {
        //        初始化菜单
//        创建菜单对象
        JMenuBar jmenuBar = new JMenuBar();
//        创建菜单选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于");
        JMenu changeImage = new JMenu("更换图片");
//        创建选项条目的对象

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        sport.addActionListener(this);
        animal.addActionListener(this);

//        将每一个选项下面的条目添加到选项当中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

//        将菜单里面的两个选项添加到菜单当中
        jmenuBar.add(functionJMenu);
        jmenuBar.add(aboutJMenu);

//        给整个界面设置菜单
        this.setJMenuBar(jmenuBar);
    }

    private void initJFrame() {
//        设置宽高
        this.setSize(603, 680);
//        设置标题
        this.setTitle("拼图单机版 v1.0");
//        设置置顶
        this.setAlwaysOnTop(true);
//        设置居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        取消默认的居中放置
        this.setLayout(null);
//        给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    public void moveImage(int clickX, int clickY, int direction) {
        int temp;
        if (direction == LEFT) {
            temp = clickY - y;
            System.out.println("向左移动" + temp + "次");
            moveLeft(temp);
        } else if (direction == RIGHT) {
            temp = y - clickY;
            System.out.println("向右移动" + temp + "次");
            moveRight(temp);
        } else if (direction == UP) {
            temp = clickX - x;
            System.out.println("向上移动" + temp + "次");
            moveUp(temp);
        } else if (direction == DOWN) {
            temp = x - clickX;
            System.out.println("向下移动" + temp + "次");
            moveDown(temp);
        }
    }

    public void moveLeft(int temp) {
        for (int i = 0; i < temp; i++) {
            step++;
            //arr[x][y]         空白方块
            //arr[x][y + 1]     空白方块右侧第一个图片
            arr[x][y] = arr[x][y + 1];//空白方块变成空白方块右侧第一个图片
            arr[x][y + 1] = 0;//空白方块右侧第一个图片变成 0 ？
            y++;
            initImage();
        }
    }

    public void moveRight(int temp) {
        for (int i = 0; i < temp; i++) {
            step++;
            arr[x][y] = arr[x][y - 1];
            arr[x][y - 1] = 0;
            y--;
            initImage();
        }
    }

    public void moveUp(int temp) {
        for (int i = 0; i < temp; i++) {
            step++;
            arr[x][y] = arr[x + 1][y];
            arr[x + 1][y] = 0;
            x++;
            initImage();
        }
    }

    public void moveDown(int temp) {
        for (int i = 0; i < temp; i++) {
            step++;
            arr[x][y] = arr[x - 1][y];
            arr[x - 1][y] = 0;
            x--;
            initImage();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会反复调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        if (victory()) {
            return;
        }
        int key = e.getKeyCode();
        if (key == 65) {
            //把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            JLabel background = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
            all.setBounds(83, 134,420, 420);
            background.setBounds(40,40,508, 560);
            this.getContentPane().add(all);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        int key = e.getKeyCode();
        //左 37  上 38  右 39  下 40
        if (key == 37) {
            System.out.println("向左移动");
            //x (y - 1) 表示空白方块左边的方块
            if (y < arr[1].length - 1) {
                moveLeft(1);
            }
        } else if (key == 38) {
            System.out.println("向上移动");
            //把空白方块下面的图片上移
            //x y 表示空白方块
            //(x + 1) y 表示空白方块下面的方块
            //把空白方块下方的数字赋值给空白方块
            if (x < arr.length - 1) {
                moveUp(1);
            }
        } else if (key == 39) {
            System.out.println("向右移动");
            if (y > 0) {
                moveRight(1);
            }
        } else if (key == 40) {
            System.out.println("向下移动");
            if (x > 0) {
                moveDown(1);
            }
        } else if (key == 65) {
            initImage();
        } else if (key == 87) {
            arr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            x = 3;
            y = 3;
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < 16; i++) {
            if (arr[i / 4][i % 4] != win[i / 4][i % 4]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");
            initData();
            step = 0;
            initImage();
        } else if (obj == reLoginItem) {
            System.out.println("重新登陆");
            this.setVisible(false);
            new LoginJframe();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("公众号");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("puzzleGame/image/QRCode.jpg"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
            jDialog.getContentPane().repaint();
        } else if (obj == girl) {
            Random r = new Random();
            System.out.println("更换图片 girl");
            int index = r.nextInt(13) + 1;
            path = "puzzleGame/image/girl/girl" + index + "/";
            initData();
            step = 0;
            initImage();
        } else if (obj == animal) {
            Random r = new Random();
            int index = r.nextInt(8) + 1;
            System.out.println("更换图片 animal");
            path = "puzzleGame/image/animal/animal" + index + "/";
            initData();
            step = 0;
            initImage();
        } else if (obj == sport) {
            Random r = new Random();
            int index = r.nextInt(10) + 1;
            System.out.println("更换图片 sport");
            path = "puzzleGame/image/sport/sport" + index + "/";
            initData();
            step = 0;
            initImage();
        }
        System.out.println(obj);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("step : " + step);
        Object obj = e.getSource();
        for (int i = 0; i < jLabels.length; i++) {
            if (obj == jLabels[i]) {
                int clickX = i / 4;
                int clickY = i % 4;
                if (clickX == x && clickY > y) {
                    moveImage(clickX, clickY, LEFT);
                    return;
                } else if (clickX == x && clickY < y) {
                    moveImage(clickX, clickY, RIGHT);
                    return;
                } else if (clickX > x && clickY == y) {
                    moveImage(clickX, clickY, UP);
                    return;
                } else if (clickX < x && clickY == y) {
                    moveImage(clickX, clickY, DOWN);
                    return;
                }
            }
        }
        System.out.println("点击但不需要移动图片");

        //点击空白方块右侧第一个图片
//        if (y < 3 && e.getSource() == jLabels[x * 4 + y + 1]) {
//            System.out.println("点击空白方块右侧第一个图片");
//            step++;
//            arr[x][y] = arr[x][y + 1];
//            arr[x][y + 1] = 0;
//            y++;
//            initImage();
//        } else if (y > 0 && e.getSource() == jLabels[x * 4 + y - 1]) {
//            System.out.println("点击空白方块左侧第一个图片");
//            step++;
//            arr[x][y] = arr[x][y - 1];
//            arr[x][y - 1] = 0;
//            y--;
//            initImage();
//        } else if (x < 3 && e.getSource() == jLabels[x * 4 + y + 4]) {
//            System.out.println("点击空白方块下侧第一个图片");
//            step++;
//            arr[x][y] = arr[x + 1][y];
//            arr[x + 1][y] = 0;
//            x++;
//            initImage();
//        } else if (x > 0 && e.getSource() == jLabels[x * 4 + y - 4]) {
//            System.out.println("点击空白方块上侧第一个图片");
//            step++;
//            arr[x][y] = arr[x - 1][y];
//            arr[x - 1][y] = 0;
//            x--;
//            initImage();
//        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
