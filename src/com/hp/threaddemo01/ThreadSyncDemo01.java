package com.hp.threaddemo01;

/*
* 多个线程同时操作一个资源诞生的  安全问题
* 比如：多个账户抢票
* 多线程的安全问题
* synchronized  锁的机制可以解决多线程的安全问题
* 解决手段是将原本的多个线程“各干各的”变为  按顺序执行
* 未加synchronized锁之前，线程是异步的  ，给方法加上synchronized 锁就会变成同步
* 将  有序的同步执行，就会解决安全问题，但是缺点是因为有序，需要等待方法内的程序走完
* 才会进行下一个线程，所以效率上会慢点
*
* synchronized锁  所在不同位置，起到不同的效果
*
*
* */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                //模拟黄牛1 取票
                while (true){
                    int ticket = tickets.getTicket();
                    //Thread.yield();//线程的让一让
                    System.out.println(getName() + "线程拿了" + ticket);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                //模拟黄牛2 取票
                while (true){
                    int ticket = tickets.getTicket();
                    //Thread.yield();//线程的让一让
                    System.out.println(getName() + "线程拿了" + ticket);
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Tickets{
    private int ticket = 20;
    public synchronized int getTicket() {
        if (ticket==0){
            System.out.println("没票了");
            throw new RuntimeException("票没了");
        }
        Thread.yield();//线程的让一让
        return ticket--;
    }
}
