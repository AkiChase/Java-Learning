package pers.ruchuby.learning.advance;

public class ObjectOrientBasis {
    public static void firstCustomObject() {
        // p 存在栈区（对象地址）  p的成员在堆区
        // java有垃圾回收  但对象引用记数为0则被当作垃圾回收（定期进行清理）
        Person p = new Person();
        p.name = "小明";
        p.age = 12;
        p.sayHello();

        Person p2 = new Person("小王", 16);
        p2.sayHello();

        //内部类
        Person.Test t = new Person.Test();
        t.test(p2);

    }

    public static void betterObject() {
        Student s = new Student("小王", 16);
        //没有c#那样的语法糖 得自己调用getter
        System.out.printf("我是一名学生，名叫:%s, 年龄:%s", s.getName(), s.getAge());

    }
}
