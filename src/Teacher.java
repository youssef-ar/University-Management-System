import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<Course> courses;

    public Teacher(String name, String id) {
        super(name, id);
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setTeacher(this);
    }
    public void removeCourse(Course course){
        course.setTeacher(null);
        courses.remove(course);
    }
    public void displayCourses(){
        for(Course course:courses){
            System.out.println(course.getCourseName());
        }
    }
}
