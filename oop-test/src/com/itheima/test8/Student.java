package com.itheima.test8;

public class Student {
        String name;
        int age;
        boolean sex;

    public Student() {
    }

    public Student(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public boolean isSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    /*public String toString() {
        return "Student{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }*/
}
