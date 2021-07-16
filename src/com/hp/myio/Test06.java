package com.hp.myio;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        //获取当前目录下的文件的名称
        File f = new File("./");
        //获取子文件和目录
        File[] files = f.listFiles();
        //循环打印
        //是文件时，打印绝对路径
        for (File file : files) {
            //判断
            if (file.isFile()) {
                //是文件，输出文件的绝对路径
                System.out.println("文件名：" + file.getAbsolutePath());
            }
        }
    }

}
