import java.security.PrivilegedAction;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;


public class Timetable {
    private HashMap<String, String> Day ;
    private HashMap<String, LocalTime> Time;
    private HashMap<String, Classroom> classroom;

    public Timetable(){
        Day=new HashMap<>();
        Time = new HashMap<>();
        classroom = new HashMap<>();
    }
    public void addCourseToTimetable(Course course, LocalTime time,String day){
        String courseCode = course.getCourseCode();
        Classroom cls = course.getClassroom();
        if(Day.containsKey(courseCode)){
            System.out.println("Course already exists in Timetable");
        }else{
            for(String key : classroom.keySet()){
                if(classroom.get(key)==cls){
                    if(Day.get(key).equals(day) && ( (Time.get(key).isAfter(time) && Time.get(key).isBefore(time.plusHours(course.getDuration())) ) || Time.get(key).equals(time))){
                        System.out.println("Another course is taking place in the same classroom and at the same time");
                        return;
                    }
                }
            }
            Day.put(courseCode,day);
            Time.put(courseCode,time);
            classroom.put(courseCode,cls);
            System.out.println("Course added to timetable");
        }
    }

    public void removeCourse(String courseCode){
        Day.remove(courseCode);
        Time.remove(courseCode);
        classroom.remove(courseCode);
    }

    public void displayTimetable(){
        for(String key : Day.keySet()){
            System.out.println("Course code: "+key);
            System.out.println("Day: "+Day.get(key));
            System.out.println("Time: "+Time.get(key));
            System.out.println("Duration : "+Course.getDuration()+" Hours");
            System.out.println("Classroom: "+ classroom.get(key).getRoomNumber());
        }
    }


}
