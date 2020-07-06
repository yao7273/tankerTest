package com.tanker;

import java.awt.*;

/**
 * @ClassName comtankertest
 * @Description
 * @Author ZY
 * @Date 2020/7/6
 * @Version 1.0
 **/
public class Tanker {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();//窗口类
        while (true){
            Thread.sleep(50);
            tankFrame.repaint();//50毫秒刷新一下当前黑块位置
        }

    }



}
