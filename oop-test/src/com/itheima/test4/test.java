package com.itheima.test4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();

            System.out.println("请输入品牌");
            String i1 = scanner.next();
            car.setBrand1(i1);

            System.out.println("请输入价格");
            int i2 = scanner.nextInt();
            car.setPrice(i2);

            System.out.println("请输入颜色");
            String i3 = scanner.next();
            car.setColor(i3);

            //添加数据到数组中
            cars[i]=car;

        }
        //System.out.println(cars);
        //遍历对象数组
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.getBrand1()+","+car.getColor()+","+car.getPrice());

        }
    }
}


