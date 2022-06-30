package com.itheima.demo4_缓冲流读写功能;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //public BufferedInputStream(InputStream in):创建一个新的字节缓冲输入流。
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day11\\resouce\\demo4\\a.txt"));
        //public BufferedOutputStream(OutputStream out)：创建一个新的字节缓冲输出流。
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day11\\resouce\\demo4\\b.txt"));


        //public BufferedReader(Reader reader):创建一个新的字符缓冲输入流。
        BufferedReader br = new BufferedReader(new FileReader("day11\\resouce\\demo4\\a.txt"));
        //public BufferedWriter(Writer writer)：创建一个新的字符缓冲输出流。
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\resouce\\demo4\\b.txt"));

        //字节流单个读写
        int by = -1;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        //字节数组读写
        int len = -1;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        //字符流单个读写
        int ch = -1;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        }
        //字符数组读写
        int len2 = -1;
        char[] chs = new char[1024];
        while ((len2 = br.read(chs)) != -1) {
            bw.write(chs, 0, len2);
        }

        //关流
        bos.close();
        bis.close();
        bw.close();
        br.close();
    }
}
