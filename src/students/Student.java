package students;

public class Student {
    private String name;
    private int age;
    private boolean hasStudentHousing;
    public Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasHasStudentHousing() {
        return hasStudentHousing;
    }

    public void setHasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }
}
