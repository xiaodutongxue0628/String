package com.hp.myio;

import java.io.File;
import java.io.IOException;

/*
 * File文件
 * File文件 你真行 可读可写可执行
 *
 * */
public class IODemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("io01.txt");//配置路径
        //查看文件是否存在，一定要有这个代码，不然文件会被覆盖
        boolean exists = file.exists();//判断文件是否存在
        if (exists) {
            System.out.println("文件已经存在，boolean值 = " + exists);
        }else {
            System.out.println("文件不存在，boolean值 = " + exists);
            boolean create = file.createNewFile();//创建文件
            System.out.println("文件创建成功" + create);
        }
        boolean isFile = file.isFile();
        System.out.println("是否是文件 = " + isFile);
        boolean directory = file.isDirectory();
        System.out.println("是否是目录 = " + directory);
        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件 = " + hidden);

//        try {
////            boolean newFile = file.createNewFile();//创建新文件
////            System.out.println("newFile = " + newFile);
////        } catch (IOException e) {
////            System.out.println("不能创建新文件");
////            e.printStackTrace();
////        }

        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);
        long length = file.length();
        System.out.println("length = " + length);


    }
}
