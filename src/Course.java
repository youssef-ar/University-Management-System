import java.util.ArrayList;

public class Course {
    String courseCode;
    static int duration = 2;
    String courseName;
    Classroom classroom;
    Teacher teacher;
    ArrayList<Student> enrolledStudents;
    ArrayList<Exam> exams;

    public Course(String courseCode, String courseName, Teacher teacher, Classroom classroom) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.teacher = teacher;
        enrolledStudents = new ArrayList<>();
        exams = new ArrayList<>();
        this.classroom=classroom;
        classroom.addCourse(this);
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }

    public void addExam(Exam exam){
        exams.add(exam);
    }
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
    public void removeStudent(Student student){
        enrolledStudents.remove(student);
    }

    public  Classroom getClassroom(){
        return classroom;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public static int getDuration(){
        return duration;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String name){
        courseCode=name;
    }
    public void displayStudents(){
        for(Student student:enrolledStudents){
            System.out.println(student.getName());
        }
    }
}
