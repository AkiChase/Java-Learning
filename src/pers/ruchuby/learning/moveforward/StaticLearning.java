package pers.ruchuby.learning.moveforward;

public class StaticLearning {
    //static修饰的成员(可以直接通过类名访问(不能通过类对象访问))
    //静态成员变量保存在堆区（和对象储存无关)
    //类、静态、非静态方法都存在方法区，对象会存一个方法的引用
    public static int age = 12;
    public String name = "测试";


    //可以构造一个工具类（成员用static修饰，并把构造器用private修饰（实现无法实例化））
    //或者使用饿汉单例 用一个公开静态成员保存本类的一个实例对象，可以通过类名获取到这个单例，进而调用类的非静态成员
    //懒汉单例  基本同上，但是是使用私有的静态成员保存一个实例对象，初始化为null，定义静态方法来获取单例（若为null则初始化）实现延迟加载
}
