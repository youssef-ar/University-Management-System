import java.util.ArrayList;

public class Group {
    String groupName;
    ArrayList<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void setGroupName(String name){
        groupName=name;
    }
    public String getGroupName(){
        return groupName;
    }
    public void displayStudents(){
        for(Student student:students){
            System.out.println(student.getName());
        }
    }
}
