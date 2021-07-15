package com.hp.collectiondemozuoye;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        List<Integer> subList = list.subList(3, 7);  //list.subList(int start,int end)获取list下标
        System.out.println("subList = " + subList);
        for (int i = 0; i <subList.size() ; i++) { //通过list长度扩大十倍
            subList.set(i,subList.get(i)*10);
        }
        System.out.println(list);
        List<Integer> subList1 = list.subList(7, 10); //获取list要删除元素的下标
        subList1.removeAll(subList1);
        System.out.println("list = " + list);

    }
}
