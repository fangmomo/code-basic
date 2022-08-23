package com.itheima.test4;

public class Car {
    private String brand1;
    private int price;
    private String color;


    public Car() {
    }

    public Car(String brand1, int price, String color) {
        this.brand1 = brand1;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return brand1
     */
    public String getBrand1() {
        return brand1;
    }

    /**
     * 设置
     * @param brand1
     */
    public void setBrand1(String brand1) {
        this.brand1 = brand1;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{brand1 = " + brand1 + ", price = " + price + ", color = " + color + "}";
    }
}
