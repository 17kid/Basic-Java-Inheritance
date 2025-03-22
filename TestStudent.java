
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        System.out.println("TESTING STUDENT CLASS");

        Student s1 = new Student("New", "Stu", 12345, "Sarcasm", 0, 0);

        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Javascript");
        s1.addCourse("Python");
        s1.addCourse("Ethical Hacking");

        s1.display();

        // System.out.println("Credits: " + s1.getCredits());
        // System.out.println("GPA: " + s1.getGpa());
        // System.out.println("Major: " + s1.getMajor());
        // System.out.println("Transfer Student: " + s1.getTransfer());

        System.out.println("Making a few adjustments...");

        s1.setCredits(0);
        s1.setMajor("Water Breather");
        s1.setGpa(4.2);

        System.out.println("Credits: " + s1.getCredits());
        System.out.println("Major: " + s1.getMajor());
        System.out.println("GPA: " + s1.getGpa());

        if(s1.dropCourse("Python")){
            System.out.println("The course Python has been dropped!");
        } else {
            System.out.println("The course Python has NOT been dropped!");
        }

        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("The student: " + s1.getFirstName() + " is enrolled in the following courses: ");
        for (String course: enrolledCourses) {
            System.out.println(course);
        }



    }
}
