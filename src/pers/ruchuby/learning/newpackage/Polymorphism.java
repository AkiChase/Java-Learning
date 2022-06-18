package pers.ruchuby.learning.newpackage;

public class Polymorphism {
    /*
    多态: 同类型的对象，执行同一行为，出现不同的行为特征
    多态侧重于行为！即方法有多态，变量没有多态

    常见形式：
        父类 a = new 子类()
        接口 a = new 实现类()

    方法调用:
    编译看左边，运行看右边 (所以只能调用左边父类中有的方法！因为编译器不知道你右边子类的内容)

    变量则都看左边
     */

    public static void main(String[] args) {
        // 自动类型转换
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.say();
        System.out.println(a1.name);
        a2.say();
        System.out.println(a2.name);

        // 只有类型对了才能调用 （强制转换： 运行时若转换失败会报错，编译阶段不会）
        //所以建议使用 instanceof 关键字来判断一下类型
        if (a2 instanceof Cat) {
            ((Cat) a2).test();
        }
    }
}

abstract class Animal {
    public String name = "动物";

    public abstract void say();
}

class Dog extends Animal {
    public String name = "狗";

    @Override
    public void say() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal {
    public String name = "猫";

    @Override
    public void say() {
        System.out.println("喵喵喵");
    }

    public void test() {
        System.out.println("测试");
    }
}