package day9.Task1;

public class Teacher extends Human {
    private String lesson;

    public Teacher(String name, String lesson) {
        super(name);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s%n", super.getName());
    }
}
