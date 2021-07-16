package com.hp.collectiondemo03;

import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String[] array = {"one","two","three"};//创建一个数组

        List list = Arrays.asList(array);  //使用Arrays.asList()方法将数组转换为集合

        System.out.println("list = " + list);

    }
}
