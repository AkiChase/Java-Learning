package pers.ruchuby.learning.advance;

/*
一个代码文件中（最外层）只能有一个public类（当然不包括内部类）
但可以有非public类
 */

public class Person {
    String name;
    int age;
    int grade = 1;
    private int ttt;

    //无参数构造器(若未定义任何构造器，编译器会自动补一个空的无参数构造器)
    public Person() {
        System.out.println("这是无参数构造器");
    }

    //有参构造器
    public Person(String name, int age) {
        grade = 2; //可以直接访问到对象的成员

        this.name = name; //使用this前缀避免被形参覆盖
        this.age = age;
        System.out.println("这是有参数构造器");
    }


    public void sayHello() {
        //%[index$][标识]*[最小宽度][.精度]转换符
        System.out.println(String.format("我的名字是:%s, 年龄是:%2s, 年级是%3s", this.name, this.age, grade));
//        System.out.printf("我的名字是:%s, 年龄是:%2s, 年级是%3s", this.name, this.age, grade) //有同样的效果
    }

    public static class Test {
        public void test(Person p) {
            System.out.println("测试");
            //实例化并调用非public类
            p.ttt = 123;
            new Test2().test2();
        }
    }
}

class Test2 {
    public void test2() {
        System.out.println("测试2");
    }
}
