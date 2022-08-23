package com.itheima.basic;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
       /* 1.打印1到100之内的整数，但数字中包含9的要跳过   9   19  91 92  个位是9或者十位是9的数要跳过
        2.每行输出5个满足条件的数，之间用空格分隔
        3.如：1 2 3 4 5
        6 7 8 10 11
        12 13 14 15 16*/
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            //个位          //十位          //百位  i/100%10
            if (i % 10 == 9 || i / 10 % 10 == 9) {
                continue;
            }
            System.out.print(i + " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }


//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//                //个位          //十位          //百位  i/100%10
//            if (i % 10 != 9 && i / 10 % 10 != 9) {
//                System.out.print(i + " ");
//                count++;
//                if (count % 5 == 0) {
//                    System.out.println();
//                }
//            }
//
//        }

    }
}

//public class Test11 {
//    public static void main(String[] args) {
//        for(int x=1; x<=10; x++) {
//            if(x%3==0) {
//
//                //在此处填写代码
//
//            }
//            System.out.println("Java基础班");
//        }
//    }
//}
//	问题:
//            1.想在控制台输出2次:"Java基础班"   括号()里面应该填写什么?	break
//            2.想在控制台输出7次:"Java基础班"   括号()里面应该填写什么?	continue
class Test03 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            if (x % 3 == 0) {

                //break;
                continue;

            }
            System.out.println("Java基础班");
        }
    }
}
/*
键盘录入一个数字, 请计算1~该数字之间, 所有的奇数和, 并将结果打印到控制台上.
		/*
			例如:
				录入: 10,   则打印:  1~10之间的奇数和为 25
				录入: -10,  则打印:  您录入的数字无效, 请重新录入.
			注意:
				如果用户录入错误数字, 则一直录入.
				直到用户录入正确的数字, 打印完结果后, 程序结束.
		*/

class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //boolean flag = true;
        while (true) {
            System.out.println("录入一个数");
            int i = scanner.nextInt();
            if (i <= 0) {
                System.out.println("数据有误");
            } else {
                int sum = 0;
                for (int a = 1; a <= i; a++) {
                    if (a % 2 != 0) {
                        sum += a;
                    }
                }
                System.out.println(sum);
                //flag = false;
                break;//表示循环结束
            }
        }
    }
}

