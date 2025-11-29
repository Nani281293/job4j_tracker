package ru.job4j.concat;

import java.util.StringJoiner;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder string = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            string.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        //Appent
        String builder1 = "abc" + "def" + "ghi";
        StringBuilder builder = new StringBuilder("abc");
        builder.append("def").append("ghi");
        System.out.println(builder);
        //Concat
        String string1 = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string1);
        //Join
        String string2 = String.join(" ", "abc", "def", "ghi");
        System.out.println(string2);
        //StringJoiner
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}
