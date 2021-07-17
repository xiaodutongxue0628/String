package com.hp.myio;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //当前所存在的目录
    File file = new File("/");

    //listFiles():查看所有文件
    File[] files = file.listFiles();

        for (File file1 : files) {
        System.out.println("所有文件和目录:"+file1.getName());
    }
}
}
