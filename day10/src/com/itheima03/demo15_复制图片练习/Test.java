package com.itheima03.demo15_复制图片练习;

import java.io.*;

public class Test {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //源路径
            File srcFile = new File("day10\\resouce\\demo15\\image.jpg");
            //输入流
            fis = new FileInputStream(srcFile);
            //目的地路径
            File descFile = new File("day10\\resouce\\demo15\\imageCopy.jpg");
            //输出流
            fos = new FileOutputStream(descFile);

            //重复读写操作
            byte[] bys = new byte[1024];
            int len = -1;
            //重复读
            while ((len = fis.read(bys)) != -1) {
                //重复写
                fos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            //关闭原则:后开先关
            try {
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
              if (fis!=null){
                  fis.close();
              }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
