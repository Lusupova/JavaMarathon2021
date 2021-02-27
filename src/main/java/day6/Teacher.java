package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student newStudent) {
        Random random = new Random();
        int mark = 2 + random.nextInt(5 - 2 + 1);

        System.out.println("Преподователь " + name + " оценил студента с именем " + newStudent.getName() + " по предмету " + subject + " на оценку " + markToString(mark));
    }

    public String markToString(int mark) {
        return switch (mark) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> "(некоректная оценка)";
        };
    }
}