class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    int empId;
    String job;

    Employee(String firstName, String lastName, int empId, String job) {
        super(firstName, lastName);
        this.empId = empId;
        this.job = job;
    }

    int getEmployeeId() {
        return empId;
    }

  
    String getLastName() {
        return super.getLastName() + " "+job;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee p = new Employee("Abhimanyu", "Kumar", 101, "SDE");

        System.out.println("First Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
        System.out.println("Employee ID: " + p.getEmployeeId());
    }
}