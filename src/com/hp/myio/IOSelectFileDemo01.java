package com.hp.myio;

import java.io.File;

/*
* IO能创建文件
* 还能查看文件
* */
public class IOSelectFileDemo01 {
    private  static long size = 0;
    public static void main(String[] args) {
        //查询当前目录的所有文件
        File file = new File(".");

        //有什么样的方法可以  全部查看所有的文件呢
        long size = findAll(file);
        System.out.println("size = " + size + "字节");


//        for (File file1 : files){
//            System.out.println("file1 = " + file1);
//            if (file.isDirectory()){
//                File[] files1 = file.listFiles();
//            }
//        }


    }

    public static long findAll(File file){
        File[] files = file.listFiles();
        for (File file1 : files){
            if (file1.isDirectory()){
                findAll(file1);   //递归
            }else {
                System.out.println("file1.length() = " + file1.length());
                size += file1.length();
            }
        }
        return size;

    }

}
