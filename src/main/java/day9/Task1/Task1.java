package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vasya", "AvtoMaster");
        Teacher teacher = new Teacher("Ivan Ivanovich", "Cherchenie");

        System.out.println(student.getGroup());
        System.out.println(teacher.getLesson());

        student.printInfo();
        teacher.printInfo();
    }
}
