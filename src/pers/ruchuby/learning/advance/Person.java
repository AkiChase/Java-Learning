package pers.ruchuby.learning.advance;

/*
一个代码文件中（最外层）只能有一个public类（当然不包括内部类）
但可以有非public类
 */

public class Person {
    String name;
    int age;

    public void sayHello() {
        //%[index$][标识]*[最小宽度][.精度]转换符
        System.out.println(String.format("我的名字是:%s, 年龄是:%2s", this.name, this.age));
    }

    public static class Test {
        public void test() {
            System.out.println("测试");
            //实例化并调用非public类
            new Test2().test2();
        }
    }
}

class Test2 {
    public void test2() {
        System.out.println("测试2");
    }
}
