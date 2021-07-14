package com.hp.dateandcollection;

import java.util.Date;

/*
*
* 企业开发中(java,bigData)日期
* 日期类的层是有一个 long值 学名UTC时间
* 1970年1月1日00：00：00开始  计算时间元年
* 日期类有两个包，sql/util,我们用util包下的日期
*
*/
public class DateDemo01 {
    public void setDate(Date date) {
        //定义一个日期
        date = new Date();
        System.out.println("date = " + date);
        long time = date.getTime();
        System.out.println("time = " + time);

    }
}
