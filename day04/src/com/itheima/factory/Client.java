package com.itheima.factory;

public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("line");
        chart.display();
    }
}
