package pers.ruchuby.learning.commonapi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LambdaExpression {
    public static void main(String[] args) {
        /*
        使用Lambda表达式化简匿名内部类的代码（但是只能简化函数接口类的匿名内部类的写法）

         */
        Flyable f = new Flyable() {
            @Override
            public void fly() {
                System.out.println("我可以飞");
            }
        };
        f.fly();


        // 使用lambda表达式来简化上述代码（注意是->不是=>)
        // @FunctionalInterface适用Lambda表达式
        Flyable f2 = () -> {
            System.out.println("我可以飞");
        };
        f2.fly();


        // 适用lambda表达式简化，注意要使用引用类型Integer
        Integer[] arr = {1, 9, 2, 4, 6, 8};
//        Arrays.sort(arr, (Integer o1, Integer o2) -> {
//            return o1 - o2;
//        });
        Arrays.sort(arr, ((o1, o2) -> o1 - o2));
        System.out.println(Arrays.toString(arr));

        /*
        进一步再简化
        1. 参数类型可以省略不写
        2. 若已有一个参数，可以省略()
        3. 方法体只有一行代码时可以省略花括号、分号（要一起省略），并且若还需要返回值时return也要省略
         */
    }
}

@FunctionalInterface //限定必须为函数形式，并且只有一个抽象方法
interface Flyable {
    void fly();
}