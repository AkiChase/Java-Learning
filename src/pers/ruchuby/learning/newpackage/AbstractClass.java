package pers.ruchuby.learning.newpackage;

public class AbstractClass {
    /*
    abstract修饰符
    修饰方法：此方法为抽象方法，所属的类一定要是抽象类。抽象方法只有方法签名，不能声明方法体
    修饰类：此类为抽象类

    抽象类是为了让子类继承（从而让子类一定要重写抽象父类中的抽象方法）
    abstract 不能修饰构造函数、变量、代码块
    抽象类不能实例化！！

     */
}

abstract class Foo {
    //抽象类可以没有抽象方法，但是有抽象方法必须用抽象类
    public void test() {
        System.out.println("测试1");
    }

    public abstract void run();
}

class Bar extends Foo {

    //一定要重写全部抽象方法（非抽象的方法不用管），否则这个类也只能用抽象类
    @Override
    public void run() {

    }
}
