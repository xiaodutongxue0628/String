package com.hp.collectiondemo03;

import java.util.ArrayList;

/*
*集合存的是对象的什么
*存的是对象的引用，当对象通过外力改变了，那么集合中的内容也会变
* */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Person fansisi = new Person();
        fansisi.setName("范思思");
        fansisi.setAge(19);
        fansisi.setHeight(160);
        ArrayList c = new ArrayList();
        c.add(fansisi);
        for (Object o : c){
            System.out.println("o = " + o);
        }
        fansisi.setHeight(165);
        fansisi.setAge(18);
        fansisi.setName("如花");
        for (Object o : c){
            System.out.println("o = " + o);
        }
        
    }
}
