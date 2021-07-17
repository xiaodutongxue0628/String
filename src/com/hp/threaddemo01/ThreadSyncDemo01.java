package com.hp.threaddemo01;

/*
* 多个线程同时操作一个资源诞生的  安全问题
* 比如：多个账户抢票
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
