package com.homework.work07_commons_io包.题目一;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        //拷贝文件
        FileUtils.copyFileToDirectory(new File("d:\\视频.itcast"), new File("e:\\"));
        //拷贝目录
        FileUtils.copyDirectoryToDirectory(new File("d:\\多级目录"), new File("e:\\"));
    }
}
