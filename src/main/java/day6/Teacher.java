package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String value = "";
        switch (random.nextInt(4) + 2) {
            case 2:
                value = "неудовлетворительно";
                break;
            case 3:
                value = "удовлетворительно";
                break;
            case 4:
                value = "хорошо”";
                break;
            case 5:
                value = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s\n" +
                "по предмету %s на оценку %s%n", this.getName(), student.getName(), this.getSubject(), value);
    }
}
