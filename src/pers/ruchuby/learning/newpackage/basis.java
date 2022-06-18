package pers.ruchuby.learning.newpackage;


import pers.ruchuby.learning.advance.Person;

public class basis {
    public static final String COURSE_NAME = "JAVA";

    public static void main(String[] args) {
        //可以直接访问同一个包下的类（所以同一个包下，哪怕文件不同也不能用相同的类名）
        //使用其他包的类需要导入
//        new Person();

        //但是本包中已有相同类名，那么要用全名(即包.路.径.类名) 此时可以不用import
//        new pers.ruchuby.learning.advance.Person("啊", 12);


        /*
            final修饰符
            1. 修饰类表明类不能被继承
            2. 修饰方法表示这个方法不能被重写(子类中也不能有同名函数)
            3. 修饰变量表示变量只能被赋值一次
        */

        final int a;
        a = 10;
//        a = 100; //不能再次赋值，有点类似于const

        //常用于函数的形参修饰
        // 类成员变量，此时要求一定要有初始值

        //final修饰引用类型时，仅仅是变量保存的地址不可变！

        /*
        常量： public static final修饰的成员变量，必须有初始值且无法被修改(一般用全大写命名)
        常量在编译时会被宏替换为常量的字面值，优化执行速度
         */
    }
}



/*
class T1 {
    public final void test() {
        System.out.println("test111");
    }
}

class T2 extends T1 {
    错误 无法重写
    public void test(){
        System.out.println("test222");
    }
}
 */


