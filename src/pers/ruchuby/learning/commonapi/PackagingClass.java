package pers.ruchuby.learning.commonapi;

public class PackagingClass {
    /*
    如int 对应的包装类为 Integer
    自动装箱：基本类型的数据和变量可以直接赋值给包装类型的变量
    自动拆箱：包装类型的变量可以直接赋值给基本数据类型的变量。

    包装类对象可以为null
    可以与字符串互转
     */
    public static void main(String[] args) {
//        Double d = Double.parseDouble("123.321");
        Double d = Double.valueOf("123.321"); //这个也可以，比较方便
        //当然无法转换的会报错

        double dd = d; //自动拆箱

        Double ddd = null;


    }
}
