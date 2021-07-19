package com.hp.threaddemo01;

/*
* 互斥锁
* */
public class ThreadSyncDemo04 {
    public static void main(String[] args) {
        Shop2 shop = new Shop2();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    shop.buy2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();t2.start();

    }

}

class Shop2{
    //如果不加上synchronized锁，完了，会火
    public void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "xxx正在选衣服");
        Thread.sleep(5000);

        synchronized (this){//使用synchronized块，锁在关键位置
            System.out.println(thread.getName() + "进入试衣间试衣服");
            Thread.sleep(5000);
            System.out.println("试完出来");
        }


    }

    //在优衣库对面买冰激凌
    public void buy2() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "买冰激凌");



    }
}