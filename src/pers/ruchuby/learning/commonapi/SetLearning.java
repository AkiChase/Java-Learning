package pers.ruchuby.learning.commonapi;

import java.util.*;

public class SetLearning {
    //set无序（只是和存的顺序不一样，其实是遵循一定的顺序的）,注意LinkedHashSet还是有序的！
    //不重复，可以用于去重
    //无索引，不能获取索引的方式遍历
    /*
    HashSet无序的原因：底层使用Hash表存储数据
    哈希表是一种对增删改查数据性能都比较好的结构
    哈希表：是jdk根据对象的地址，按某种规则计算出的int类型数值
    Object类的hashCode 可以获取对象的hash值

    jdk8之后哈希表底层采用数组+链表+红黑树组成（之前没有红黑树）

    创建一个默认长度16的数组，数组名table
    根据元素的哈希值跟数组的长度求余计算出应存入的位置（哈希算法）
    判断当前位置是否为null,如果是nu直接存入
    如果位置不为nul,表示有元素，则调用equals方法比较
    如果一样，则不存（所以会去重复），如果不一样，则存入数组，
        JDK7新元素占老元素位置，指向老元素
        JDK8中新元素挂在老元素下面（形成链表），链表长度超过8后，转为红黑树


    若想Set认为两个自定义对象是重复的，则要重写类的hashCode和equals方法（让两个函数都返回相同的内容，才会被认定为重复）
     */

    public static void main(String[] args) {
        //Set的api并没有从Collection上扩展太多
//        Set<String> set = new HashSet<>();
        Set<String> set = new LinkedHashSet<>(); //有序的！
        //LinkedHashSet只是每个元素又额外多了一个双链表的机制，记录存储顺序(读取时顺着双链表的顺序来查找元素，从而保证顺序不变）

        //TreeSet 一定要排序（默认按大小升序，字符串是按首字符编号）
        //自定义数据时需要指定排序规则（否则报错）
        /*
        方式1： 类要实现Comparable接口中的compareTo方法
        方式2: TreeSet用有参构造，指定比较规则
         */


        set.add("java");
        set.add("python");
        set.add("html");
        set.add("java");
        set.add("python");
        set.add("html");
        System.out.println(set);

        //TreeSet中其实可以只实现compareTo来去重,hashCode和equals可以不写
//        Set<MyStudent> set2 = new TreeSet<>();

        //优先使用TreeSet中的比较器 lambda简写
        //浮点型中记得使用Double.compare()
        Set<MyStudent> set2 = new TreeSet<>((o1, o2) -> o1.age - o2.age);
        set2.add(new MyStudent("小明", 18, 6));
        set2.add(new MyStudent("小华", 12, 3));
        set2.add(new MyStudent("小王", 12, 3));
        set2.add(new MyStudent("小明", 18, 6)); //重复项，不会存入
        System.out.println(set2);
    }
}


class MyStudent implements Comparable<MyStudent> {
    String name;
    int age;
    int grade;

    public MyStudent(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override //大于o则返回正整数，小于o则返回负整数，相等返回0（注意这个相等会认为是对象相同,导致去除重复项）
    public int compareTo(MyStudent o) {
        return this.age - o.age;
//        return this.age - o.age >= 0 ? 1 : -1; //可以避免age相同时被视为重复项而除去(但是equals的去重失效）
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override //equals重写，保证内容相同对象返回true
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStudent myStudent = (MyStudent) o;
        return age == myStudent.age && grade == myStudent.grade && Objects.equals(name, myStudent.name);
    }

    @Override //hashCode的重写，保证了内容相同的对象返回同样的哈希值
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }

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
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}