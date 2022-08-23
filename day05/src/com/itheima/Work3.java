package com.itheima;

/*定义一个方法，该方法可以求数组的平均值 ，具体的数组是方法调用时传入*/
public class Work3 {
    public static void main(String[] args) {
        int arr[]={0,3,3,4,5};
        int average = getAverage(arr);
        System.out.println(average);
    }

    public static int getAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }

}
