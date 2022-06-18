package pers.ruchuby.learning.moveforward;

public class CodeBlock {
    // static 修饰的代码块  属于类 与类一同加载，优先执行
    // 此处经常来初始化静态成员变量的值
    // 注意此处只能访问静态成员(类名可以省略)
    static {
        System.out.println("静态代码块被触发执行");
    }

    public CodeBlock() {
        System.out.println("构造器被调用");
    }

    //构造代码块  每次构造器执行之前调用  不常用
    {
        System.out.println("构造代码块被触发执行1");
    }

    {
        System.out.println("构造代码块被触发执行2");
    }
}
