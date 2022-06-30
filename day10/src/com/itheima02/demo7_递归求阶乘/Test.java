package com.itheima02.demo7_递归求阶乘;

public class Test {
    public static void main(String[] args) {
        /*
          1~5阶乘:  1*2*3*4*5
          分析:
          1~5阶乘= 1~4阶乘 * 5
          ...
          1~2阶乘= 1~1阶乘 * 2
          1~1阶乘= 1

          规律:1~n阶乘= 1~(n-1)阶乘  *  n
          出口:  1~1阶乘= 1
         */
        int result = factorial(5);
        System.out.println(result);
    }

    /**
     * 求1到n的阶乘
     *
     * @param n 代表1~n的阶乘
     * @return 1~n的阶乘的结果
     */
    public static int factorial(int n) {
        //出口
        if (n == 1) {
            return 1;
        }
        //规律
        return factorial(n - 1) * n;
    }
}
