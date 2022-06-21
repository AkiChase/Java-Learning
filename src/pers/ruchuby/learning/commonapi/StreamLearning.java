package pers.ruchuby.learning.commonapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLearning {
    /*
    数组、集合的stream流操作，得益于lambda可以简化代码
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "张师傅");

//        Stream<String> s = list.stream();

        List<String> res = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).toList();
        System.out.println(list);
        System.out.println(res);

        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        //stream是当前java代码主推的一种形式(流水线),当然对流的操作不会修改来源的值
        //map可以分别获取键、值、键值对的Stream

//        list.stream().reduce()
//        list.stream().limit()  获取前几个
//        list.stream().skip()  跳过几个
//        list.stream().distinct()  去除重复项（依赖equals hashCode）
//        Stream.concat(s1, s2) 合并流
        System.out.println(Stream.concat(list.stream(), list.stream()).toList());

        /*
        流的收集方式：
        1. toList
        2. toSet
        3. toMap(kyeFunction, valFunction)
         */

        List<String> list2 = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());  //注意这个返回的才是可变的
        list2.add("噢噢");
        System.out.println(list2);

//        list.stream().toList()  直接toList返回的是不可变List！

    }
}
