package com.hp.threaddemo01;

/*
* 线程的打断
* 背景： 1.小A：喜欢吃肉...100块
*        2.小B：打断小A
*
* */
public class TreadDemo05 {
    public static void main(String[] args) {
        Thread xiaoA = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){
                    try {
                        System.out.println("吃肉" + i);
                        i++;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            if (e.getMessage().equals("sleep interrupted")){
                                System.out.println("小B打断小A吃肉");
                                break;
                            }
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        xiaoA.start();

        Thread xiaoB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    xiaoA.interrupt();//打断小A
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        xiaoB.start();


    }
}
