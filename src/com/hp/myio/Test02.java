package com.hp.myio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入文件名");
        Scanner scanner= new Scanner(System.in);
        String sc = scanner.nextLine();
        File file = new File(sc);
        String name = file.getName();
        if (sc != name) {
            boolean exists = file.exists();//判断文件是否存在
            boolean create = file.createNewFile();
            System.out.println("文件已经存在，为你创建副本 = " + create);
        }else {
            System.out.println("文件不存在，boolean值 = " + name);
            boolean create1 = file.createNewFile();//创建文件
            System.out.println("文件创建成功" + create1);
        }
    }
}
