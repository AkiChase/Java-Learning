package pers.ruchuby.learning.commonapi;


import java.util.Objects;

public class ObjApi {
    public static void main(String[] args) {
        Student s = new Student("小明", 16);
        Student s2 = new Student("小明", 16);

        //obj的toString() 默认是返回对象的地址

        System.out.println(s);
        System.out.println(s.equals(s2));
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //使用代码生成
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //手写toString
    //    @Override
//    public String toString() {
//        return String.format("学生\t姓名:%s\t年龄%s", name, age);
//    }


    //自动生成equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //比较类是否相同
        Student student = (Student) o; //强制转换类型
        return age == student.age && name.equals(student.name);//比较每个值
    }
}
