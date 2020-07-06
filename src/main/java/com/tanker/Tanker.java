package com.tanker;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ClassName comtankertest
 * @Description
 * @Author ZY
 * @Date 2020/7/6
 * @Version 1.0
 **/
public class Tanker {

    public static void main(String[] args) {
        Frame f = new Frame();//窗口类
        f.setSize(800,600);
        f.setResizable(false);//设置是否可以改变窗口大小
        f.setTitle("tanker test");
        f.setVisible(true);//设置窗口可见性

        //添加窗口监听器，用于关闭窗口
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //super.windowClosing(e);
            }
        });



    }



}
