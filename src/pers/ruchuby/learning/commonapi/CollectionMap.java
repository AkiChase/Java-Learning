package pers.ruchuby.learning.commonapi;

import java.util.*;
import java.util.function.Consumer;

public class CollectionMap {
    /*
    集合虽然可以不指定类型，但是经常使用泛型来限定类型（注意只能存引用）

    Collection为单列（分为List和Set），List又分为ArrayList,LinkedList; Set分为HashSet->LinkedSet, TreeSet等等，只列举部分
    List是接口，添加的元素是有序、可重复、有索引的
    Set是接口，添加的元素是无序，不可重复，无索引的
    但不一定，有些有序

    linkedList是双向链表（首位操作快）


    Map为双列（键值对)
    集合特点：
    长度不固定，类型不固定，只能存引用类型，方便增删改（每次修改不需要重新排序）
     */

    public static void main(String[] args) {
        collectionMain();
    }

    public static void collectionMain() {
        //多态
        Collection arr = new ArrayList();
        arr.add("aaa");
        arr.add("ccc");
        arr.add("bbb");
        arr.add("ccc");


        Collection arr2 = new HashSet();
        arr2.add("aaa");
        arr2.add("ccc");
        arr2.add("bbb");
        arr2.add("ccc");

        System.out.println(arr);
        System.out.println(arr2);

        arr.remove("ccc");//如果有则删除匹配的第一个，否则返回false
        System.out.println(arr);
        System.out.println(arr);

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(4);
        arr3.add(9);

        arr3.remove(3); //传入要删除的索引
//        arr3.remove(new Integer(9)); //此处删除值相同的对象，所以需要传入对象(String就方便多了，直接就是对象）
        //其实主要是因为有二义性，不得不用这种方式，不然默认是视为索引

        System.out.println(arr3);

//        int[] arrs = arr3.toArray(); //不可行，因为有可能绕过语法检查，添加Integer以外的类型
        Object[] arrs = arr3.toArray();
        System.out.println(Arrays.toString(arrs));

        System.out.println(arr3.contains(1));

        //迭代器

        //while循环
//        Iterator<Integer> it = arr3.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //增强for循环
        //此处的for循环会对每个元素取副本！引用类型在此处也是副本，所以修改后对原容器内元素无影响
        for (int ele : arr3) {
            //注意此处修改无意义
            System.out.println(ele);
        }

        //java8开始，有了使用lambda表达式的简化遍历方式：foreach
        //其具体实现使用了增强for循环，所以注意都是副本

        //完整写法
//        arr3.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                //同样的取到每个元素
//                System.out.println(integer);
//            }
//        });

        //lambda缩写
        arr3.forEach(num -> System.out.printf("元素值:%s\n", num));


        //使用迭代器或者增强for循环时，直接删除原集合中的元素，会出现并发问题
        /*
        解决:
        iterator中使用it.remove() :删除当前所在元素，并且迭代器不会后移
        使用自己的普通for循环{
        1. 倒着遍历
        2. 正着遍历，但删除当前元素后，要将遍历索引--
        }
         */
    }
}
