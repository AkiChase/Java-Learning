package pers.ruchuby.learning.moveforward;

public class Inheritance {
    public static void main(String[] args) {
        /*
        实际上所有类都是Object类的子类
        实例化一个子类时，先实例化父类（子类不会继承父类的构造函数！可以在子类的构造函数中supper()来调用父类构造函数，有参、无参都可以）
        若不写supper()会自动调用父类无参构造函数（必须要有，否则会报错)

        内存：都存在堆内，父类仍然存在父类对应空间，子类存在子类对应的空间（储存独属于子类的成员)
        子类中调用父类成员其实是通过对父类成员的指向


        子类不可以直接访问父类的私有成员(但是可以通过其他手段访问到)
        静态成员可以通过子类访问到

        java不支持多继承，为了避免二义性。当然，可以多层继承

        在子类中访问成员，遵循就近原则（子类中找，然后父类，然后爷爷类...） 由此可以实现成员的重写，但是加@Override 更加安全优雅
        如果一定要调用父类的，就使用supper.xxx   (supper是私有成员，要在类内访问)

         */
        Student s = new Student("小明", 12, 1);
        s.sayHello(); //调用父类方法

        Student.sayFoo(); //调用父类静态方法
//        s.sayFoo(); //不建议通过对象访问静态方法

    }
}

//父类
class Person {
    public String name;
    public int age;

    public Person() {
        System.out.println("父类被无参数实例化了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类被有参数实例化了");
    }

    public void sayHello() {
        System.out.printf("你好呀，我叫%s，今年%s岁\n", name, age);
    }

    public static void sayFoo() {
        System.out.println("foo~");
    }
}

//子类
class Student extends Person {
    public int grade;

    public Student(String name) {
        //通过this来调用兄弟构造器（其实就是默认值的实现方式）
        this(name, 1, 1);
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;

    }

    // 重写，@Override 加上后编辑器、编译器会有提示（类型一致、访问权限的提示）
    // 私有成员不能重写！即不能加Override ，静态方法不能重写即不能加Override（就是访问的问题)
    // 但其实都可以直接写不加override，到最后都是访问的问题，只是不建议这么做
    @Override
    public void sayHello() {
        System.out.println("调用父类的sayHello");
        super.sayHello();
        System.out.printf("你好呀，我叫%s，今年%s岁，上%s年级\n", name, age, grade);
    }

}