package com.hp.threaddemo01;

/*
* 线程...
*    以前代码都是  自上到下的执行，那么我想有个分支？？
*
* 创建线程的第一种方式，缺点：直接extends Thread ， 那么，浪费一次继承机会
* */
public class ThreadDemoo1 {
    public static void main(String[] args) {
        Thread t1 = new HotWaterThread();  //创建一个线程
        Thread t2 = new XiCaiThread();  //创建一个线程
        t1.start();
        t2.run();
        //像这样的  坐一会洗菜  做一会烧水，那么这个就叫异步，没有先后顺序
        //如果是  把烧水全部做完，再做洗菜，这个叫做同步，同步有先后顺序
    }
}

//如果只单单new Thread，他只是一个线程，线程中没有方法（任务），没意义
//需要自己创建一个线程，继承他的任务（方法）
//线程中最有意义的就是run方法！！
class  HotWaterThread extends Thread{
    //重要的，，线程方法！！
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("烧了" + i + "瓶水");
        }
    }
}

class XiCaiThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("洗了" + i + "个白菜");
        }
    }
}