package com.itheima03.demo14_字节输入流常用功能;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {

        //public int read():从输入流读取数据的下一个字节。
        FileInputStream fis = new FileInputStream("day10\\resouce\\demo14\\a.txt");

        //System.out.println((char) fis.read());
        //System.out.println((char) fis.read());
        //System.out.println((char) fis.read());
        //System.out.println((char) fis.read());
        //System.out.println((char) fis.read());
        //System.out.println(fis.read());
        //System.out.println(fis.read());

        int by = -1;
        //判断by得到的值如果不等于-1 代表读到了
        while ((by = fis.read()) != -1) {
            System.out.println((char) by);
        }
        //public void close():关闭此输入流并释放与此流相关联的任何系统资源。
        fis.close();
        System.out.println("-------");
        //public int read(byte[] b):从输入流中读取一些字节数，并将它们存储到字节数组b中。
        FileInputStream fis2 = new FileInputStream("day10\\resouce\\demo14\\a.txt");
        int len = -1;
        byte[] bys = new byte[2];

        //将字节数组读取，并存放到这个数组中
        //存放原理:将读到的数据，在数组中，按照顺序逐个替换。
        //返回结果:代表读取的数据的个数，如果没读取到，返回-1

        // len = fis2.read(bys);
        //System.out.println(len);
        //System.out.println(Arrays.toString(bys));
        //len = fis2.read(bys);
        //System.out.println(len);
        //System.out.println(Arrays.toString(bys));
        //len = fis2.read(bys);
        //System.out.println(len);
        //System.out.println(Arrays.toString(bys));
        //len = fis2.read(bys);
        //System.out.println(len);
        //System.out.println(Arrays.toString(bys));

        //判断len得到的值如果不等于-1，代表读到了
        while ((len = fis2.read(bys)) != -1) {
            //System.out.println(Arrays.toString(bys));
            //String(byte bytes[], int offset, int length)
            System.out.println(new String(bys, 0, len));
        }
        fis2.close();
    }
}
