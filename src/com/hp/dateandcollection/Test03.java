package com.hp.dateandcollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 */
public class Test03 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//定义日历
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的生日：（格式为：yyyy-MM-dd）");
        String s = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//指定格式时间转换

        Date date = null;//转换成日期
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            System.out.println("你的输入有误，请重新按照格式输入");
            e.printStackTrace();
        }

        long datetime = date.getTime();//时间转换成毫秒值

        long todaytime = new Date().getTime();//获取当前日期毫秒值

        long hive = todaytime - datetime;//差值

        System.out.println("你已经生活了" + hive / 1000 / 60 / 60 / 24 / 7 + "周");
    }
}
