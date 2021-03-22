import java.util.ArrayList;
/**
 * This class represents courses offered by a university
 *
 * @author Evan Rich
 * @version March 22 2021
 */
public class Course
{
    private static ArrayList<Course> allCourses = new ArrayList<>();
    // instance variables
    public String courseNumber;
    private String title;
    private String instructor;
    public ArrayList<Student> studentsInCourse;

    /**
     * Constructor for objects of class Course
     */
    public Course(String number, String title, String instructor)
    {
        courseNumber = number;
        this.title = title;
        this.instructor = instructor;
        studentsInCourse = new ArrayList<>();
        allCourses.add(this);
    }

    /**
     * Method to print the course number, title, and instructor of every course the university offers
     */
    public void printEveryCourse()
    {
        for(Course course : allCourses)
        {
            System.out.println(course.courseNumber + " - " + course.title + " - " + course.instructor);
        }
    }
}
