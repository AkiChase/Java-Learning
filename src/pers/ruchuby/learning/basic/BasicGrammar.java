package pers.ruchuby.learning.basic;


import java.util.Random;
import java.util.Scanner;

public class BasicGrammar {
    public static void variable() {

        //变量类型

        // 整数类型
        double a = 6.66; //默认用double  8个字节
        float aa = 6.6f; //float要加f或F 4个字节
        int b = 6;
        byte e = 127; // -128~127


        // String为引用数据类型
        String c;
        c = "来日等不过方长";
        char d = 65;    //字符 A
        //空字符 中间用空格
        System.out.println(' ');


        //布尔类型
        boolean flag = true;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }

    public static void typeConversion() {
        // 自动类型转换
        byte a = 10;
        int b = a; //自动从小范围转换为大范围  内存中在左侧补充0
        float c = b; // int to float(double也可以)
        System.out.println(c);

        double d = a + b + 2.3; //表达式 自动提升
        // byte char 等类型在运算时都会转化为int

        // 基本与C#一致
    }

    public static void operator() {
        // + - * /  %取余

        //注意int相除的时候还是int
        System.out.println(3 / 2);
        System.out.println(3 * 1.0 / 2); //这样才能得到double


        // 能计算就按原类型计算，否则按字符串合并
        System.out.println(10 + 'a'); // 107
        System.out.println('a' + "你好" + 10); // a你好10

        // ++ -- 前后自增 自减
        // += -= *= /= %=
        //如a+=b 等同于 a = (a的类型) a+b  包含了强制类型转换

        // 关系运算符 == != >= <=等等

        //位运算符  位运算符判断时左右都会运算
        System.out.println(true | false); // 或
        System.out.println(false & true);// 与
        System.out.println(!true); //非
        System.out.println(true ^ true); //异或   两者不等则为true

        // 逻辑运算符 ! && ||

        //三元运算符
        System.out.println(1 > 2 ? "1>2为真" : "1>2为假");

        /*
        运算符优先级 与c++有细微的差别
        1. ()之类括号最高
        2. !  ++ --
        2. 加减乘除之类的
        3. 左右移运算
        4. 逻辑判断
        4. 逻辑位运算
        5. 逻辑运算（&& ||）
        6. += -=之类
         */
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("请输入字符串");
        String s = sc.next();
        System.out.println(s);


    }

    public static void processControl() {
        int a = 10;
        int b = 20;
        // if else
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        // switch
        switch (a) {
            case 10:
                System.out.println("a=10");
                break;
            default:
                System.out.println("默认");
        }

        //for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //while
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 3) break;
        }
        // do while 基本差不多

        //死循环写法
//        while (true)
//        for (; ; )
//        do{}while (true)


        //随机数
        Random r = new Random();
        System.out.println(r.nextInt(100)); // 0-99
        System.out.println(r.nextInt(100) + 10); // 10-109
    }

    public static void arr() {
        //静态数组 就和c++差不多
//        int[3] a = new int[]{1,2,3};
        int[] a = {1, 2, 3, 4}; //简化写法（动态初始化）

        // 整数类型的默认值为0  String 的为 null
        int[] b = new int[10]; //但此时不能 {1,2,3,4}来赋值 （静态初始化）

        //冒泡排序
        int arr[] = {13, 51, 12, 48, 36};

        //循环长度-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //没轮判断 长度-轮序号（从0开始）-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

    }
}
