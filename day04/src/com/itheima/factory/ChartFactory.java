package com.itheima.factory;

public class ChartFactory {
    //图表工厂类：工厂类

    //静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("Histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        else if (type.equalsIgnoreCase("Pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        else if (type.equalsIgnoreCase("Line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;

    }

}