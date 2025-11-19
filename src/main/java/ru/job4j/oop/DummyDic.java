package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Незвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String eng = "Pronunciation";
        String say = word.engToRus(eng);
        System.out.println(say);
    }
}
