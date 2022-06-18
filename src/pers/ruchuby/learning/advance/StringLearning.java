package pers.ruchuby.learning.advance;

public class StringLearning {
    public static void Constructor() {
        //1. 直接使用"xxx" 这种的存在 字符串常量池中（相同的常量字符串会共用）
        String s1 = "abc";

        //2. 使用构造器 存在堆区，不会共用 s2!=s1 地址不同
        String s2 = new String(new char[]{'a', 'b', 'c'});

        String s3 = "ab";
        System.out.println(s1 == s2 + "a"); // false  因为只有直接"xxx"给出的才是常量   s2+"a"会存在堆区
        System.out.println(s1 == "a" + "b" + "c"); // true 因为编译器会优化
    }

    public static void StringEquals() {
        String s1 = "1234";
        String s2 = new String("1234");
        System.out.println(s1 == s2); //比较地址 false
        System.out.println(s1.equals(s2)); //只比较内容，不比较地址 true
//        s1.equalsIgnoreCase() 忽略大小写比较
//        s1.replace()
//        s1.toCharArray()
//        s1.charAt() //不能用[index]来访问char
//        s1.substring()
//        s1.split()
    }
}
