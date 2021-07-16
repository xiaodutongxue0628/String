package com.hp.collectiondemo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 *
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//创建集合

        for (int i = 0; i <10 ; i++) {
            //生成随机数
            Random random = new Random();

            //在50个数里随机抽10个存在list集合里
            int num = random.nextInt(50);
            list.add(num);
            //将集合排序
            Collections.sort(list);
        }
        System.out.println("list = " + list);

    }
}
