import java.util.ArrayList;

public class Classroom {
    String roomNumber;
    ArrayList<Course> courses;

    public Classroom(String roomNumber) {
        this.roomNumber = roomNumber;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public String getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber){
        this.roomNumber=roomNumber;
    }
    public void displayCourses(){
        for(Course course:courses){
            System.out.println(course.getCourseName());
        }
    }
}
