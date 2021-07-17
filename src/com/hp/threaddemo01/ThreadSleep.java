package com.hp.threaddemo01;

/*
* 线程中的阻塞
* 举个项目中的例子
* 河南电信———3000张电话卡——————>中国电信
* 18937283298
* 19937421817
* ....
* */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            Thread.sleep(20);//线程的阻塞
            System.out.println("访问中国电信" + i + "次");
        }
        //其实main方法就是一个线程，是一个主线程
        Thread thread = Thread.currentThread();//拿到当前的线程
        String name = thread.getName();   //线程的名字
        System.out.println("name = " + name);
        long id = thread.getId();    //线程的唯一id
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon();//是否守护线程
        System.out.println("daemon = " + daemon);
        int priority = thread.getPriority();
        System.out.println("priority = " + priority);//线程的优先级
        boolean alive = thread.isAlive();//线程是否死亡
        System.out.println("alive = " + alive);



    }
}
