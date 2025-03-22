
import java.util.ArrayList;

public class Student extends Person {
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;

    public Student(String fName, String lName, int id, String major, double gpa, int credits){
        super(fName, lName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        this.balance = 0;
        enrolledCourses = new ArrayList<>();
    }

    public void addCourse(String course){
        this.enrolledCourses.add(course);
    }

    public boolean dropCourse(String course){
        if (this.enrolledCourses.contains(course)) {
            this.enrolledCourses.remove(course);
            return true;
        }

        return false;
    }

    public String getMajor(){
        return this.major;
    }

    public double getGpa(){
        return this.gpa;
    }

    public int getCredits(){
        return this.credits;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean getTransfer(){
        return this.transfer;
    }

    public ArrayList<String> getEnrolledCourses(){
        return this.enrolledCourses;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void setCredits(int credits){
       this.credits = credits;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setTransfer(boolean transfer){
        this.transfer = transfer;
    }

}
