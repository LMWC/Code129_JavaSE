package com.itheima.demo1_jdk7版处理异常;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
       /* try (数据类型 变量名1=对象1;数据类型 变量名2 = 对象2;...) {
            // 操作
        } catch (IOException e) {
    	...
        }*/

        //放在try的小括号中的内容，将来在执行完try的代码后，会自动关闭。
        try (FileInputStream fis = new FileInputStream(""); FileOutputStream fos = new FileOutputStream("")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        //但是只有实现了Closeable接口的类才能用这种格式。
        //try(String si="";Integer i=10 ){
        //
        //}catch (Exception e){
        //
        //}

    }
}
