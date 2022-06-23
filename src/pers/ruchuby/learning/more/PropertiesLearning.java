package pers.ruchuby.learning.more;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLearning {
    //是Map集合，可以把对象中的键值对存储到属性文件中去（以.properties结尾)
    //键值都是String
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
//        p.setProperty("键1", String.valueOf(true));
//        p.setProperty("222", "hhh");
//        p.store(new FileWriter("./test.properties"), "this is my custom comment!");

        p.load(new FileReader("./test.properties"));
        System.out.println(p);
        System.out.println(p.stringPropertyNames());
        System.out.println(p.getProperty("键1"));
    }
}
