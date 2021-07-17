package com.hp.myio;

/*
* file的其他
*
* */

import java.io.File;

public class IODemo02 {
    public static void main(String[] args) {
        //创建文件夹， 所有的IO底层都不是Java操作的，而是Java调用所在系统的底层的操作
        File file = new File("io");
        if(!file.exists()){
            file.mkdir();//不加s 只能创建1层，  加s可以创建多层，一般用加s
        }else {
            System.out.println("文件已经存在");
        }

        File file1 = new File("io1/io2/io3");
        if(!file1.exists()){
            file1.mkdir();
        }else {
            System.out.println("文件已经存在");
        }
    }
}
