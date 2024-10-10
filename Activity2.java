// Base class
class Education {
    private String degree;
    private String university;

    public Education(String degree, String university) {
        this.degree = degree;
        this.university = university;
    }

    public void displayEducationInfo() {
        System.out.println("Degree: " + degree);
        System.out.println("University: " + university);
    }
}

// Intermediate class
class Person extends Education {
    private String name;
    private int age;

    public Person(String degree, String university, String name, int age) {
        super(degree, university); // Call the constructor of Education
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        displayEducationInfo(); // Call method from Education
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Intermediate class
class Employee extends Person {
    private String employeeId;

    public Employee(String degree, String university, String name, int age, String employeeId) {
        super(degree, university, name, age); // Call the constructor of Person
        this.employeeId = employeeId;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo(); // Call method from Person
        System.out.println("Employee ID: " + employeeId);
    }
}

// Derived class
class Manager extends Employee {
    private String department;

    public Manager(String degree, String university, String name, int age, String employeeId, String department) {
        super(degree, university, name, age, employeeId); // Call the constructor of Employee
        this.department = department;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo(); // Call method from Employee
        System.out.println("Department: " + department);
    }
}

// Main class to test the multilevel inheritance
public class Activity2 {
    public static void main(String[] args) {
        Manager manager = new Manager("MBA", "Harvard", "Alice", 35, "M123", "Sales");
        manager.displayManagerInfo();
    }
}

