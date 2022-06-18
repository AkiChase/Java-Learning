package pers.ruchuby.learning.newpackage;

public class InnerClass {
    /*
    内部类的好处，可以调用类的私有成员
    提供更好的封装性，因为类也能用private protect等修饰
     */


    public static void main(String[] args) {
        // 匿名内部类，快速产生一个子类，加快代码编写
        // 经常用于抽象类的快速实现（然后用于多态）
        // 此外可以作为方法的实际参数：
        // 比如某个函数需要一个接口对象作为参数，就可以使用匿名内部类传递一个对象（之后有一些语法糖可以再次简化代码）

        Father f = new Father() {
            @Override
            public void Foo() {
                System.out.println("匿名内部类");
            }
        };
        //f不是Father对象 而是匿名内部类的对象（只是类型转换了）
        f.Foo();
    }
}

class Father {
    public void Foo() {
        System.out.println("父类");
    }
}
