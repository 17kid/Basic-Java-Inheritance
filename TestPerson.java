public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("New", "Student", 12345);

        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("ID: " + person.getId());

        person.display();

    }
}
