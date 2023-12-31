import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> courses;
    private ArrayList<Club> clubs;
    private Group group;

    public Student(String name, String id) {
        super(name, id);
        courses = new ArrayList<>();
        clubs = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void dropOutCourse(Course course){
        courses.remove(course);
        course.removeStudent(this);

    }
    public void enrollInClub(Club club){
        clubs.add(club);
        club.addMember(this);
    }

    public void leaveGroup(){
        group.removeStudent(this);
        group=null;

    }
    public void joinGroup(Group group){
        this.group=group;
        group.addStudent(this);
    }


    public ArrayList<Club> getClubs() {
        return clubs;
    }

    public Group getGroup() {
        return group;
    }

    public void displayCourses(){
        for(Course course:courses){
            System.out.println(course.getCourseName());
        }
    }
    public void displayClubs(){
        for(Club club:clubs){
            System.out.println(club.getClubName());
        }
    }

}
