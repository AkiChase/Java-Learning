package pers.ruchuby.learning.commonapi;

public class StringBuilderLearning {
    public static void main(String[] args) {
        //StringBuilder会初始化额外16 个字符的缓冲区，每次append都会判断缓冲区是否足够长，不够则扩充到当前字符长度的2倍
        StringBuilder sb1 = new StringBuilder();
        sb1.append(123);
        sb1.append("aaa");
        sb1.append('c').append(3.3).append(1); //可以链式调用
        sb1.reverse();
        sb1.replace(0, 1, "开始:");
        System.out.println(sb1);
        System.out.println(sb1.length());
        //更多api可以去查
    }
}
