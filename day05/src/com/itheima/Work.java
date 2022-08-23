package com.itheima;

import java.util.Scanner;

/*
 * 定义一个方法，该方法可以求任意一个三位数的各个位数的立方和。定义并且调用该方法。*/
public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数");
        int i = scanner.nextInt();
        int num = getNum(i);
        System.out.println(num);
    }

    public static int getNum(int number) {
        int ge = number / 1 % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        //求各个位的立方和
        int sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
        return sum;
    }
}
