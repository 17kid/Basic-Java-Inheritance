public class Professor extends Person {
    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor (String fName, String lName, int ID, String department, double salary) {
        super(fName, lName, id);
        this.department = department;
        this.salary = salary;
        advisees = new ArrayList<>();
    }

    public void addAdvisee(Student s){
        if(this.advisees.contains(s)){
            System.out.println("The student has not been added to the array list!");
        }

        this.advisees.add(s);
        System.out.println("Student successfully added");
    }

    public boolean removeAdvisee(int ID){
        for (Student s : this.advisees) {
            if (s.contains(ID)){
                this.advisees.remove(s);
                return true;
            }
        }

        System.out.println("could not remove student from list, check implementation");
        return false;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getSalary(){
        return this.salary;
    }

    public ArrayList<Student> getAdvisees(){
        return this.advisees;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}