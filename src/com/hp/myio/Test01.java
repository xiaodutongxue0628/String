package com.hp.myio;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");//配置路径
        //查看文件是否存在，一定要有这个代码，不然文件会被覆盖
        boolean exists = file.exists();//判断文件是否存在
        if (exists) {
            System.out.println("文件已经存在，boolean值 = " + exists);
        }else {
            System.out.println("文件不存在，boolean值 = " + exists);
            boolean create = file.createNewFile();//创建文件
            System.out.println("创建成功" + create);
        }
        //输出文件名字
        String name = file.getName();
        System.out.println("文件名字为 = " + name);
        //输出文件大小
        long length = file.length();
        System.out.println("文件大小为 = " + length);
        //输出最后修改时间
        Date date = new Date(file.lastModified());//lastModified() ：返回文件的最后修改时间标志
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//自定义时间格式
        String format = sdf.format(date);//显示自定义时间格式
        System.out.println("最后修改时间为 = " + format);

    }
}
