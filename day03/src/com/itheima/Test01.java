package com.itheima;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //键盘录入一个数字  赋值给变量week
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        //用switch判断week的值  输出不同的结果
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("请输入1~7");
                break;
        }
    }
}
