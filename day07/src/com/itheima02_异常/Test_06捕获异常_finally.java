package com.itheima02_异常;

/*
捕获异常完整格式
	与try结合使用，当try中内容执行，finally一定执行，若try执行前程序结束，finally不执行。
	格式:
	        try{
	            编写可能会出现异常的代码
	        }catch{
	            处理异常的代码/记录日志/打印异常信息/继续抛出异常
	        }
	        ...
	        finally{
	            执行try中行为执行后，一定要执行的操作，一般用于结束资源
	        }
需求:通过除数为0异常，演示finally使用效果

 */
public class Test_06捕获异常_finally {
    public static void main(String[] args) {
        //System.out.println(10/0);

        //finally是执行对应的try执行后，一定要执行的代码。
        try {
            //连接文件
            System.out.println(10/0);
        //自己捕获
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("try中代码执行后一定要执行的内容");
            //关闭文件的连接(保证虚拟机结束前一定执行)
        }



        try {
            //连接文件
            System.out.println(10/0);
        //没有捕获，将来将异常交给虚拟机处理。
        }finally {
            System.out.println("try中代码执行后一定要执行的内容");
            //关闭文件的连接(保证虚拟机结束前一定执行)
        }


    }
}
