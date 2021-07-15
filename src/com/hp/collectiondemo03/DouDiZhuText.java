package com.hp.collectiondemo03;

import java.util.*;

/*
* 斗地主模拟洗牌
* 牌数：54张，大王，小王，1-k ，四个桃
* ♥，♠，♣，♦
* */
public class DouDiZhuText {
    public static void main(String[] args) {
        //1.先做出来四个花色
        List<String > colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♦");
        colors.add("♣");
        
        //2.做出来4个2-10
        List<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
            numbers.add("J");
            numbers.add("Q");
            numbers.add("K");
            numbers.add("A");
            
        //3.上面的colors和number进行一个整合
        //放入到一个新的集合中   如何做到呢？嵌套循环
        List<String> piker = new ArrayList<>();
        //Set<String> piker = new HashSet<>();
        for (String color : colors){
            for (String number : numbers){
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("littleKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
        //如果使用set也无法分开排序，有个方法可以打乱他
        //只能打乱list  因为set是无序的
        Collections.shuffle(piker);//打断list的排序
        System.out.println("piker = " + piker);
        Collections.sort(piker);//list的快速排序（不是人工指定的）
        System.out.println("piker = " + piker);
        //给player1 player2 player3 发牌
        List<String> player1 = new ArrayList<>();//玩家1
        List<String> player2 = new ArrayList<>();//玩家2
        List<String> player3 = new ArrayList<>();//玩家3
        List<String> diPai = new ArrayList<>();//3张底牌
        for (int i = 0; i < piker.size(); i++) {
            String pName = piker.get(i);//每张扑克牌
            if (i >= 51){
                diPai.add(pName);//埋最后3张的底牌
            }else {
                //给玩家1，2，3发前面的51张牌
                if(i%3==0){
                    player1.add(pName);
                }else if (i%3==1){
                    player2.add(pName);
                }else {
                    player3.add(pName);
                }
            }
        }
        System.out.println("diPai = " + diPai);
        System.out.println("player1 = " + player1);
        System.out.println("player1 = " + player1.size());
        System.out.println("player2 = " + player2);
        System.out.println("player1 = " + player2.size());
        System.out.println("player3 = " + player3);
        System.out.println("player1 = " + player3.size());
        

    }
}
