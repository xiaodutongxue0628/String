package com.hp.collectiondemo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 排序集合！！对集合进行自然排序（从小到大）
* 他只能对list排序，对set不可以，因为set是无序的
* */
public class SortListDemo01 {
    public static void main(String[] args) {
        //纯数字
        List<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(73);
        list.add(34);
        list.add(22);
        list.add(1);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);

        //纯字符串
        List<String> list1 = new ArrayList<>();
        list1.add("刘顺顺");
        list1.add("汪高阳");
        list1.add("卢光辉");
        list1.add("貂蝉");
        list1.add("小乔");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);

        //对象的排序（应用的地方很广）
        Person p1 = new Person();
        p1.setName("貂蝉");
        p1.setHeight(167);
        p1.setAge(19);

        Person p2 = new Person();
        p2.setName("吕布");
        p2.setHeight(192);
        p2.setAge(30);

        Person p3 = new Person();
        p3.setName("小乔");
        p3.setHeight(160);
        p3.setAge(18);

        Person p4 = new Person();
        p4.setName("西施");
        p4.setHeight(170);
        p4.setAge(20);

        Person p5 = new Person();
        p5.setName("赵云");
        p5.setHeight(188);
        p5.setAge(24);

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);
        Collections.reverse(personList);
        System.out.println("personList = " + personList);



    }
}
