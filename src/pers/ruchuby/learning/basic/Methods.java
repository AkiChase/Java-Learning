package pers.ruchuby.learning.basic;

public class Methods {
    //值传递
    public static int sum(int a, int b) {
        return a + b;
    }

    //引用传递
    public static void setArrVal(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
    }

    //注意 java中不存在默认参数 只能使用重载
    //方法名相同，但是形参列表类型不同的会发生重载（不考虑返回值、方法类型、形参名称）
    public static void setArrVal(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
    }

}
