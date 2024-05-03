package students;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setAge(30);
        System.out.println(student.getAge());

        student.course = new Course();
        student.course.title = "Computer Science";
        student.course.level = "undegr";
        student.course.startDate = "07/21";
    }
}
