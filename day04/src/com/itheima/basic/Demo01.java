package com.itheima.basic;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        //需求：在控制台输出1-5    和5~1的数据
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);*/


        for (int i = 12; i <= 53; i++) {
            System.out.println(i);
        }

		/*System.out.println(5);
		System.out.println(4);
		System.out.println(3);
		System.out.println(2);
		System.out.println(1);*/

       /* for(int i = 5;i>=1;i--){
            System.out.println(i);
        }*/

    }
}

class Demo02 {
    public static void main(String[] args) {
        //需求：求1-5之间的数据和，并把求和结果在控制台输出
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}

class Demo03 {
    //需求：求1-100之间的奇数和，并把求和结果在控制台输出
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);


    }
}
class Demo04{
    public static void main(String[] args) {
        /*需求：在控制台输出所有的 “水仙花数”
        123   3*3*3+2*2*2+1*1*1       100~999
		水仙花数是一个三位数
		水仙花数的个位、十位、百位的数字立方和等于原数*/

        //统计思想
        int count=0;
        for (int i=100;i<1000;i++){
          int ge=i/1%10;
          int shi=i/10%10;
          int bai=i/100%10;

          if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==i){
              count++;
              System.out.print(i+"  ");
              if(count%2==0){
                  System.out.println();
              }
          }

        }
    }
}
class Demo05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("请输入一个数 -1代表结束");
            int week=scanner.nextInt();
            switch (week){
                case 1:
                    System.out.println("星期一");
                default:
                    System.out.println("baibai");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case -1:
                    System.out.println("结束再见");
                    flag=false;
                    break;

            }
        }

    }
}
class Demo06{
    public static void main(String[] args) {
        Random random = new Random();
        //1-100
                                //2-78
        int ran=random.nextInt(77)+2;
        System.out.println(ran);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入您猜的数据:");
            int i = scanner.nextInt();
            if(i>ran){
                System.out.println("猜大了");
            }else if(i<ran){
                System.out.println("猜小了");
            }else{
                System.out.println("猜中了");
                break;
            }

        }

    }
}








