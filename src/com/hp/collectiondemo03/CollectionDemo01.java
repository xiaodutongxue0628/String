package com.hp.collectiondemo03;

import java.util.ArrayList;
import java.util.Collection;

/*
*集合：非常重要
* */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        //ArrayList c1 = new ArrayList();
        //add添加
        c1.add("唐僧--执着的目标");
        c1.add("孙悟空--过硬的技术");
        c1.add("猪八戒--体贴关怀");
        c1.add("沙和尚--稳重的劳动");
        c1.add("白龙马--任劳任怨");

        System.out.println("c1 = " + c1);

        //集合的尺寸
        int size = c1.size();
        System.out.println("size = " + size);
        boolean empty = c1.isEmpty();//是否为空
        System.out.println("empty = " + empty);
        //c1.clear();//清空
        System.out.println("c1 = " + c1);
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);
        //集合遍历  3  种
        //1.
//        for (int i = 0; i < c1.size(); i++) {
//            System.out.println("c1.= " + c1.get(i));
//        }
        //思考:为什么collection不能使用for循环
        //因为set集合没有索引下标，所以for循环不能使用到collection中
        for (Object o : c1){
            System.out.println("o = " + o);
        }
        //迭代器和for循环的区别，
        //迭代器工作：有游标，问下一个，有没有下一个元素，如果有就拿出，没有就结束
        //for循环工作：把集合从0--N  排序，从0开始取，拿下标



    }
}
