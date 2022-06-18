package pers.ruchuby.learning.advance;

public class Student {
    /*
    所谓（狭义）的封装，就是把成员变量设置为私有，然后设置getter和setter来暴露
    其实就是选择性的暴露接口

    一般来说只用public private protected

    修饰符有4种
    private : 仅仅在同一类内可见（包括不同对象但同一类）
    default (缺省）: 同一包内可见，但是不同包
    protected : 同一个包中的类，若不在同一个包中，必须为其子孙类才可使用
    public : 都可见
     */

    //标准JavaBean 被称为实体类
    //成员变量用private修饰，提供getter setter
    //必须要有无参构造器


    public Student() { //为了满足要求3
    }

    // 右键开启菜单->生成->构造器
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age; //添加 private 修饰（不修饰默认public）

    // 右键开启菜单->生成->getter 和 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
