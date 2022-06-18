package pers.ruchuby.learning.newpackage;

public class Enumeration {
    /*
    枚举类 enum
    第一行列举枚举内容的名称

    枚举类都是继承了java.lang.Enum
    是最终类，并且构造器都是私有的（枚举外不能实例化）
    每一个枚举内容都会成为此类的一个对象（是常量)
     */
    public static void main(String[] args) {
//        Season.values() //返回枚举对象数组
//        Season.valueOf("SPRING"); //返回字符串对应的枚举对象（不存在会报错）

        // 对枚举进行for循环
        for (Season s :
                Season.values()) {
            System.out.printf("%s:%s\n", s.name(), s.ordinal()); //ordinal()返回的是枚举的索引
        }
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}
