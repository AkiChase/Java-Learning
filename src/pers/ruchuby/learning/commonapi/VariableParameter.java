package pers.ruchuby.learning.commonapi;

public class VariableParameter {
    /*
    可变参数，类似于*arg，只能放在形参列表的最后且只有一个
    可以传入0,1，n个参数，或者数据
    实际上在方法内就是一个数组
     */
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum());
        System.out.println(sum(new int[]{1, 2, 3}));
    }

    public static int sum(int... nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        return s;
    }
}
