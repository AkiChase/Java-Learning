package pers.ruchuby.learning.commonapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateLearning {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime()); //获取日期时间戳
        System.out.println(date);
        //日期对象也能用 时间戳来构造 long 类型
        System.out.println(new Date(date.getTime() + 1000 * 60 * 10)); //+10min


        // SimpleDateFormat
        // 1. format 可以格式化输出long 时间戳  或者 Date
        // 2. parse 可以解析字符串为Date

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String dateStr = "2019-03-09 11:11:11";
        try {
            Date date2 = sdf.parse(dateStr);
            System.out.println(sdf.format(date2.getTime() + 1000 * 60 * 5));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*
        java8起有了更多类型的日期API
        LocalDate 不含时间
        LocalTime 不含日期
        LocalDateTime 两者都含
        Instant 时间戳 和之前的Date很相似 可以相互转换 toDate  toInstant

        基本都是不可变的（类似String），所以修改时间后返回一个新的时间对象
         */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();

        // LocalDateTime 日期格式化输出两种写法（都使用DateTimeFormatter)
        System.out.println(dateTimeFormatter.format(ldt));
        System.out.println(ldt.format(dateTimeFormatter));


        //解析时间
        LocalDateTime ldt1 = LocalDateTime.parse("2019-03-09 11:11:11", dateTimeFormatter);


    }
}
