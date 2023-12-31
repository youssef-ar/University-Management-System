public class Exam {
    private String examCode;
    private Course course;

    public Exam(String examCode, Course course) {
        this.examCode = examCode;
        this.course = course;
    }
    private String getExamCode() {
        return examCode;
    }

    private void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    private Course getCourse() {
        return course;
    }

    private void setCourse(Course course) {
        this.course = course;
    }


}
