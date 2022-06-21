package pers.ruchuby.learning.more;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionLearning {
    /*
    catch可以多重
    Exception会捕获所有类型的异常

    throw 主动抛出异常
    throws是方法可能抛出异常的声明，用在声明方法时，表示该方法可能要抛出异常

     */
    public static void main(String[] args) {
        try {
//            parseTime("2022-0103-12:12:12");
            throw new MyException("这是自定义错误！");
        } catch (Exception e) {
            System.out.println("出错了！");
            e.printStackTrace(); //打印错误栈
        } finally {
            System.out.println("无论有没有异常都会执行，且会在之前代码的return之前");
        }

    }

    //若错误抛出ParseException
    public static void parseTime(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
    }
}


class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
