package pers.ruchuby.learning.commonapi;


import java.util.ArrayList;

public class CustomArrayList {
    /*
    泛型<?>代表可以接受所有类型
    泛型上下限：
    1. <? extend XXX> 表示可以接受XXX或其子类的所有类型  表示XXX是上限
    2. <? super XXX> 表示可以接受XXX或其父类的所有类型   表示XXX是下限
     */

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("java");
        myArrayList.add("python");
        myArrayList.add("js");
        myArrayList.add("html");
        printArray(myArrayList.toArray());
    }

    public static <T> void printArray(T[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }

    }
}

//一种包装的思想
class MyArrayList<E> {
    private ArrayList<E> arrayList = new ArrayList<>();

    public void add(E e) {
        arrayList.add(e);
    }

    public void remove(E e) {
        arrayList.remove(e);
    }

    public Object[] toArray() {
        return arrayList.toArray();
    }
}


