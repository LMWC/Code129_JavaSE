package com.itheima02.demo6_递归求和;

public class Test {
    public static void main(String[] args) {
        /*
        1~5和:1+2+3+4+5
        1~5和=1~4和 + 5
        1~4和=1~3和 + 4
        ...
        1~2和=1~1和 + 2
        1~1和 = 1
        规律:
            1~n和=1~(n-1)+n
        出口:
            1~1和 = 1
         */

        int sum = getSum(2);
        System.out.println(sum);
    }

    /**
     * 该方法用于求1~n的和
     *
     * @param n n代表将来该方法求的是1~n的和
     * @return 返回1~n的和
     */
    public static int getSum(int n) {
        //出口  1~1和 = 1
        if (n == 1) {
            return 1;
        }
        //规律
        return getSum(n - 1) + n;
    }
}
