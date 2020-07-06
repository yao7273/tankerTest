package com.tanker;

import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

/**
 * @ClassName tankerTest
 * @Description
 * @Author ZY
 * @Date 2020/7/6
 * @Version 1.0
 **/
public class TankFrame extends Frame {

    //定义坐标，控制黑方块位置
    int x = 200;
    int y = 200;

    Dir dir = Dir.CENTER;
    private static final int  SPEED = 10;

    //构造函数
    public TankFrame(){
        this.setSize(800,600);
        this.setResizable(false);//设置是否可以改变窗口大小
        this.setTitle("tanker test");
        this.setVisible(true);//设置窗口可见性

        //添加键盘监听器，监听键盘操作，获取数据
        this.addKeyListener(new MyKeyListener());

        //添加窗口监听器，用于关闭窗口
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //super.windowClosing(e);
            }
        });
    }

    //画黑方块，自动调用
    @Override
    public void paint(Graphics g) {
        //从左上角为坐标原点
        System.out.println(" paint ");
        g.fillRect(x,y,50,50);
        switch (dir){
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;

        }


       // x += 10;
       // y += 10;
    }



    //创建内部类用户键盘监听处理对象
    class MyKeyListener extends KeyAdapter{

        Boolean bl = false;
        Boolean br = false;
        Boolean bu = false;
        Boolean bd = false;

        //键盘按下时调用
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    bl = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    br = true;
                    break;
                case KeyEvent.VK_UP:
                    bu = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bd = true;
                    break;

                 default:
                        break;
            }

            setMainTankDir();

           // x += 100;
           // repaint();//当键盘按下时重新调用paint函数设置画板
        }

        //键盘抬起时调用
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    bl = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    br = false;
                    break;
                case KeyEvent.VK_UP:
                    bu = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bd = false;
                    break;

                default:
                    break;
            }
            setMainTankDir();
        }

        private void setMainTankDir() {
            if (bl) {
                dir = Dir.LEFT;
            }else if (br) {
                dir = Dir.RIGHT;
            }else if (bu) {
                dir = Dir.UP;
            }else if (bd) {
                dir = Dir.DOWN;
            }else {
                dir = Dir.CENTER;
            }



        }
    }



}
