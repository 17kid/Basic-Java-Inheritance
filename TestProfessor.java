
import java.util.ArrayList;

public class TestProfessor {

    public static void main(String[] args) {
        System.out.println("TESTING PROFESSOR");

        Student s1 = new Student("Drake", "Bell", 123, "Rock", 0, 0);
        Student s2 = new Student("Amanda", "Bynes", 456, "CS", 0, 0);
        Student s3 = new Student("Dylon", "Dylon", 789, "Spittin Hot Fye", 0, 0);
        Student s4 = new Student("New", "Stu", 000, "Sarcasm", 0, 0);

        Professor prof1 = new Professor("Coach", "Creighton", 99, "CS", 1);

        prof1.display();

        System.out.println("Professor's Department: " + prof1.getDepartment());
        System.out.println("Professor's Salary: " + prof1.getSalary());

        prof1.setDepartment("Rock");
        prof1.setSalary(2);

        prof1.addAdvisee(s1);
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);

        if (prof1.removeAdvisee(123)) {
            System.out.println("The student has been removed!");
        } else {
            System.out.println("The student has not been removed!");
        }

        if (prof1.removeAdvisee(123)) {
            System.out.println("The student has been removed!");
        } else {
            System.out.println(
                    "The student had not been removed may not be an advisee of: "
                    + prof1.getFirstName() + " " + prof1.getLastName());
        }

        ArrayList<Student> myAdvisees = prof1.getAdvisees();

        System.out.println("Profeessor " + prof1.getFirstName() + " advisees are: ");
        for (Student s : myAdvisees) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }

    }
}
