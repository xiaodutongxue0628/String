package com.hp.myio;

import java.io.File;

public class Word01 {
    public static void main(String[] args) {
        get("D:\\Desktop\\作业\\10作业"); //设置需要获取的路径
    }

    public static void get(String a) {
        File b = new File(a); //获取路径
        File[] files = b.listFiles();//获取路径下的所有文件
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory())
                    get(file.getAbsolutePath());  //getAbsolutePath()：返回绝对路径
                else if (file.isFile() && file.getName().endsWith(".class"))//如果文件的后缀名为.java就输出
                    System.out.println(file.getName());
            }
        }

    }
}
