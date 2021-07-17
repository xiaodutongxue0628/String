package com.hp.threaddemo01;

/*
*创建线程的第二种方式，继承，用实现
* */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable shaoShui = new ShaoShui();
        Runnable xicai = new XiCai();

        Thread xicaiThread = new Thread(xicai);
        Thread shaoShuiThread = new Thread(shaoShui);

        xicaiThread.start();
        shaoShuiThread.start();

    }
}

class XiCai implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("洗了" + i + "个白菜");
        }
    }
}

class ShaoShui implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("烧了" + i + "瓶水");
        }
    }
}