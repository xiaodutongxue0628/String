package com.hp.threaddemo01;

/*
* 线程创建的最好用的  匿名内部类
* 线程创建的方式3
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++){
                    System.out.println("洗了" + i + "个白菜");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 200; i++){
                    System.out.println("烧了" + i + "水");
                }
            }
        }.start();


    }
}
