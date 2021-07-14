package com.hp.dateandcollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*
* 企业开发中(java,bigData)日期
* 日期类的层是有一个 long值 学名UTC时间
* 1970年1月1日00：00：00开始  计算时间元年
* 日期类有两个包，sql/util,我们用util包下的日期
* 这个日期类  功能有限， 如需  日期计算  ，需要使用  日期类解决
*
*/
public class DateDemo01 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);
        long time = date.getTime();
        System.out.println("time = " + time);

        //练习：查看10天后是哪一天
        time = time + 1000*60*60*24*10L;
        date.setTime(time);
        System.out.println("date = " + date);
        //修改日期显示格式  yyyy 必须小写  日期转字符串
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String pattern1= "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String chinaDateStr = sdf.format(date);
        System.out.println("chinaDateStr = " + chinaDateStr);
        //字符串---->转日期
        System.out.println("-------------------------------");
        String dateStr="2004-03-13 21:08:13";
        try {
            Date parse = sdf.parse(dateStr);
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            System.out.println("你的日期字符串可能不是一个日期，请你重新填写");
            e.printStackTrace();
        }
    }

}
