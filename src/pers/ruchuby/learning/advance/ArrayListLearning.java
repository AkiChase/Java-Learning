package pers.ruchuby.learning.advance;

import java.util.ArrayList;

public class ArrayListLearning {
    /*
    ArrayList 称为集合
    存储的实际上是指针
     */
    public static void basis() {
        // 未指定泛型时可以存储所有类型元素（但建议使用Object类型来限定）
        ArrayList list = new ArrayList();

        list.add("java");
        list.add(123);
        list.add(1.23);
        list.add(0, false);
        System.out.println(list);

        // 指定泛型后只能存储指定类型  int类型要使用Integer
        // 实际上是集合只能储存引用类型（int是值类型，Integer才是int的引用类型）
//        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); // 后面的类型申明可以不写，编译器会自动推断
        ArrayList<Integer> integerArrayList = new ArrayList<>(); //但是尖括号还是要写的
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);

        // 不能 [index] 只能用set get方法
        integerArrayList.set(2,666);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.remove(0));
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.remove(new Integer(666))); // 删除第一个与输入内容相同的元素
        System.out.println(integerArrayList);
        System.out.printf("数组的大小:%s", integerArrayList.size());


    }
}
