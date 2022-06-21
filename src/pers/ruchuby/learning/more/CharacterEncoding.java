package pers.ruchuby.learning.more;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class CharacterEncoding {
    public static void main(String[] args) {
        String s = "abc如初";
        try {
            byte[] bytes = s.getBytes("GBK");
            System.out.println(new String(bytes)); //默认是UFT-8 会乱码
            System.out.println(new String(bytes, "GBK"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
