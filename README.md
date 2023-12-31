# University Management System Documentation

## Overview
___
The University Management System is a Java-based application designed to manage university-related entities such as students, teachers, courses, clubs, and administrative employees. It provides functionalities for enrollment in courses, clubs, managing timetables, and more.
## Classes
___
### 1. Person
* An abstract class featuring fundamental attributes like name and ID.
### 2. Student
* Extends the Person class, introducing additional attributes such as group affiliation and lists of enrolled courses and clubs.
* Facilitates the enrollment or withdrawal from courses and clubs, in addition to providing functionality for displaying these enrolled courses and clubs.
* Allows joining or leaving a group.
### 3. Teacher
* Extends Person class and includes additional attributes such as list of courses
* Enables the addition and removal of courses, along with the capability to display them.
### 4. AdministrationEmployee
* Extends Person class and includes additional attributes such as the job.

### 5. Courses
* Includes attributes such as courseCode, courseName , teacher and the list of enrolled students.

### 6 . Classroom
* Represents a physical classroom, featuring attributes like the room number and a list of courses.
### 7 . Club
* Includes attributes like club name and list of members.
### 8. Group
* Features attributes such as the group name and a list of members.
### 9. Timetable
* Facilitates the addition of a course to the timetable within a designated classroom and at a specified time, ensuring that there are no scheduling conflicts with other courses occurring in the same classroom during the given time period.
### 10. Exam
* Includes attributes such as exam code and course
___

This documentation provides an insight into the purpose and functionalities of each class within the University Management System.
