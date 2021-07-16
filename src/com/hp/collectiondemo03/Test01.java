package com.hp.collectiondemo03;

import java.util.ArrayList;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();//创建c1集合
        //往c1添加数据
        c1.add("one");
        c1.add("two");
        c1.add("three");
        System.out.println("c1 = " + c1);//输出c1集合

        ArrayList<String> c2 = new ArrayList<>();//创建c2集合
        //往c2添加数据
        c2.add("four");
        c2.add("five");
        c2.add("six");
        System.out.println("c2 = " + c2);//输出c2集合

        //将c2元素全部存入c1集合
        c1.addAll(c2);
        System.out.println("c1 = " + c1);//查看输出c1

        ArrayList<String> c3 = new ArrayList<>();//创建c3集合
        //往c3添加数据
        c3.add("one");
        c3.add("six");

        //查看集合c1是否包含集合c3中的所有元素
        boolean aa = c1.containsAll(c3);
        System.out.println("aa = " + aa);

        //将c1集合中的"two"删除后再输出c1集合
        boolean later = c1.remove("two");
        System.out.println("c1 = " + c1);
    }

}




