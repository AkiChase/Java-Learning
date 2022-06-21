package pers.ruchuby.learning.commonapi;

import java.util.HashMap;
import java.util.Map;

public class MapLearning {
    /*

    HashMap最常用 键的是无序，不重复的  其键部分使用了哈希表HashSet（所以自定义对象为键时要重写hashCode和equals来避免重复)
    LinkedHashMap 键有序 键类似LinkedHashSet
    TreeMap 键排序 键类似TreeSet

    键值对可以都为null

     */
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("测试", 1);
        maps.put("学习", 2);
        maps.put(null, 2);
        maps.put("空的", null);

        System.out.println(maps);
        System.out.println(maps.get("空的"));
        System.out.println(maps.remove(null));
//        maps.containsKey()
//        maps.containsValue()
        System.out.println(maps.keySet());
        System.out.println(maps.values());

        //maps遍历 方式1，通过keySet()得到Set，按Set方式遍历

        //方式2 键值对遍历 比较麻烦 通过entrySet得到键值对Set然后按Set遍历
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue(); //注意有null值时使用int会报错
            System.out.printf("键:%s\t值:%s\n", key, val);
        }

        System.out.println("--------------");

        //方式3 java8后引入的lambda模式，内部是使用了entrySet()
        maps.forEach((k,v)->{
            System.out.printf("键:%s\t值:%s\n", k, v);
        });

    }
}
