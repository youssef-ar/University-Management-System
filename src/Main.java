import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Create instances of classes
        Classroom classroom1 = new Classroom("Room 101");
        Classroom classroom2 = new Classroom("Room 202");

        Teacher teacher1 = new Teacher("John Doe", "T001");
        Teacher teacher2 = new Teacher("Jane Smith", "T002");

        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course1 = new Course("C001", "Math", teacher1, classroom1);
        Course course2 = new Course("C002", "History", teacher2, classroom2);

        Club club1 = new Club("Chess Club");
        Club club2 = new Club("Art Club");

        AdministrationEmployee admin1 = new AdministrationEmployee("Admin1", "A001", "Secretary");

        Timetable timetable = new Timetable();

        // Enroll student in courses and clubs
        student1.enrollInCourse(course1);
        student1.enrollInClub(club1);

        student2.enrollInCourse(course2);
        student2.enrollInClub(club2);

        // Add courses to timetable
        timetable.addCourseToTimetable(course1, LocalTime.of(9, 0), "Monday");
        timetable.addCourseToTimetable(course2, LocalTime.of(14, 0), "Wednesday");

        // Display timetable
        timetable.displayTimetable();

        // Display enrolled courses and clubs for students
        System.out.println("Enrolled courses for " + student1.getName() + ":");
        student1.displayCourses();
        System.out.println("Enrolled clubs for " + student1.getName() + ":");
        student1.displayClubs();

        System.out.println("Enrolled courses for " + student2.getName() + ":");
        student2.displayCourses();
        System.out.println("Enrolled clubs for " + student2.getName() + ":");
        student2.displayClubs();

        // Display courses for teachers
        System.out.println("Courses for " + teacher1.getName() + ":");
        teacher1.displayCourses();
        System.out.println("Courses for " + teacher2.getName() + ":");
        teacher2.displayCourses();
    }
}