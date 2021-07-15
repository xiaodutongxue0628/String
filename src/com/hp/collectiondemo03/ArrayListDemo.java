package com.hp.collectiondemo03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* JDK  8   的快速去集合中的属性
* 
* 
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaoChan = new Person();
        diaoChan.setAge(20);
        diaoChan.setHeight(170);
        diaoChan.setName("貂蝉");
            
        Person xiaoQiao = new Person();
        xiaoQiao.setAge(18);
        xiaoQiao.setHeight(165);
        xiaoQiao.setName("小乔");
        
        Person sunShangXiang = new Person();
        sunShangXiang.setAge(20);
        sunShangXiang.setHeight(166);
        sunShangXiang.setName("孙尚香");

        //需求:给定一个list person对象的集合，需要一个String集合，该集合中的值是提取与上面3000个list中的name值  把美女的名字都存进去
        List list = new ArrayList();
        list.add(diaoChan);
        list.add(xiaoQiao);
        list.add(sunShangXiang);
        System.out.println("list = " + list);
        
        List<String> names = new ArrayList<>();
//        names.add(diaoChan.getName());
//        names.add(xiaoQiao.getName());
//        names.add(sunShangXiang.getName());
//        System.out.println("names = " + names);

//        List<String> names = new ArrayList<>();
//        for (Person s : list){
//            String name = s.getName();
//            names.add(name);
//        }
//        System.out.println("names = " + names);

        //以上是传统的，新的呢？ JDK 8 Stream()
//        List<String> nameLists = list.stream().map(Person::getName).collect(Collectors.toList());
//        System.out.println("nameLists = " + nameLists);
    }
}
