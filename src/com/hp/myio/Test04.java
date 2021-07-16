package com.hp.myio;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //获取当前目录下的文件以及文件夹的名称
        File file=new File("/");
        File[] files = file.listFiles();
        for (File f:files) {
            System.out.println("所有文件:"+f.getName());
        }
    }
}
