abstract class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void personDetails() {
        System.out.println("\nPerson Particulars");
        System.out.println("Name: " + name + "\nAddress: " + address);
    }

    public abstract void studentDetails();
}

class Student extends Person {
    String dept;
    int id;

    public Student(String name, String address, String dept, int id) {
        super(name, address);
        this.dept = dept;
        this.id = id;
    }

    public void studentDetails() {
        System.out.println("\nStudent Particulars");
        System.out.println("Dept: " + dept + "\nID: " + id);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", "Bengaluru", "CSE", 01);
        st1.personDetails();
        st1.studentDetails();
    }
}