package pers.ruchuby.learning.commonapi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalLearning {
    //封装浮点型数据为对象，实现高精度
    //不能直接用double数据来new构造，会精度损失
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10");

        BigDecimal bd2 = BigDecimal.valueOf(3); //最常用！

//        10/3 得到的结果无法精确，BigDecimal会报错（因为他一定要精确）
//        BigDecimal bd3 = bd1.divide(bd2);
        BigDecimal bd3 = bd1.divide(bd2, 2, RoundingMode.HALF_UP); //2位小数 四舍五入


        double rs = bd3.doubleValue();
        System.out.println(rs);
    }
}
