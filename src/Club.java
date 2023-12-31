import java.util.ArrayList;

public class Club {
    String clubName;
    ArrayList<Student> members;

    public Club(String clubName) {
        this.clubName = clubName;
        members = new ArrayList<>();
    }

    public void addMember(Student student) {
        members.add(student);
    }
    public void removeMember(Student student){
        members.remove(student);
        student.getClubs().remove(this);
    }

    public String getClubName(){
        return clubName;
    }
    public  void setClubName(String name){
        clubName=name;
    }
    public void displayStudents(){
        for(Student student:members){
            System.out.println(student.getName());
        }
    }

}
