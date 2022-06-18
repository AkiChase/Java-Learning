package pers.ruchuby.learning.commonapi;

public class MathLearning {
    public static void main(String[] args) {
        //Math是工具类
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.ceil(1.1));//向上取整
        System.out.println(Math.floor(1.1));//向下取整

        System.out.println(Math.round(9.5));//四舍五入
        System.out.println(Math.round(9.4));//四舍五入
        System.out.println(Math.random()); //0-1随机数
    }
}
