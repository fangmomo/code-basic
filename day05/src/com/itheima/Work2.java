package com.itheima;

        /*
        定义一个方法，该方法可以求1~n的和  。
        n的值是方法调用时传入*/
public class Work2 {
    public static void main(String[] args) {
        int sum = getSum(10);
        System.out.println(sum);
    }

    public static int getSum(int n){
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;

    }
}
