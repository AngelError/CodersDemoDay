package javaCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        b();
        c();
        b();
    }

    private static void c() {
        list.add("aaa");
    }

    private static void b() {
        System.out.println(Arrays.toString(list.toArray()));
    }
}
