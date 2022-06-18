package pers.ruchuby.learning.newpackage;

public class InterfaceClass {
    /*
    接口  用 interface修饰的抽象类
    接口是用来被实现的，继承了接口的类成为实现类（所谓的子类）

    接口是一种规范，成员方法一定都是公开、抽象的，成员变量都是常量
    public abstract final static可以省略不写

    继承多个接口时，注意方法的重载
    此外常量若存在重名,请使用 接口名.常量名来调用

    java8及高版本允许接口内定义方法体
    有静态和default两种方法
    default的要用继承了接口的子类的实例化对象来调用
    静态方法要用接口名来调用
    default修饰的要用对象来调用，若此处还出现重名，就不得不重写了(可以在内用 接口.supper.方法名来调用对应接口的）

    private jdk9开始使用的，只能在类内调用

    一个类继承了父类，又实现了接口，若碰到同名成员，两者相比优先使用父类的

     */
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.fly("aaa");
        b.test();

    }
}

interface Flyable {
    String KEY = "a s d w上下左右";

    void fly();

    default void test() {
        System.out.println("默认fly1");
    }

    static void say() {
        System.out.println("我能直接飞");
    }
}

interface FlyWithToolAble {
    String KEY = "坐飞机呀";

    void fly(String tool);

//    default void test(){
//        System.out.println("默认fly2");
//    }

    static void say() {
        System.out.println("我能间接飞");
    }
}


//可以继承于 接口1,接口2,接口3等等
class Bird implements Flyable, FlyWithToolAble {

    @Override
    public void fly() {
        System.out.println(Flyable.KEY);
        Flyable.say();
    }

    @Override
    public void test() {
        System.out.println("重写test");
    }

    @Override
    public void fly(String tool) {
        System.out.println(FlyWithToolAble.KEY);
        FlyWithToolAble.say();
    }
}
