package com.hp.myio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
* 文件的拷贝
* */
public class IODemoCopy01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile copyTarget = new RandomAccessFile("javaapi.zip", "r");
        RandomAccessFile secondName = new RandomAccessFile("javaapi.zip", "rw");
        int d = -1;   //io里面-1  就代表读取完毕
        while (true) {
            if ((d = copyTarget.read()) != -1) {
                secondName.write(d);
            }
        }
    }
}
