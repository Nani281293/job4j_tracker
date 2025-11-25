package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Brychin Ivan Nikolaevich");
        student.setGroup("intern");
        student.setAdmission(2025, 10, 23);
        System.out.println(student.getFio() + " является студентом группы: "
                + student.getGroup() + ", начал свое обучение " + student.getAdmission());
    }
}
