package com.hp.myio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Word02 {
    public static void main(String[] args) {
        Thread thread = new NowThread();//创建一个新线程
        thread.start();//运行线程
    }

    private static class NowThread extends Thread {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        @Override
        public void run() {
            while (true){
                //获取现在的时间
                Date date = new Date();
                String format = sdf.format(date);
                System.out.println("现在是北京时间 = " + format);

                try {
                    Thread.sleep(1000);//睡眠时间为1000毫秒（1秒）
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
