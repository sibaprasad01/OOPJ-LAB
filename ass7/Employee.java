
class Employee{
        String name;
        String job;
        double salary;
        Employee(String name, String job, double salary){
            this.name = name;
            this.job = job; 
            this.salary = salary;
    }
    public void calculate(){
        System.out.println("Employee name is : "+name);
        System.out.println("Employee job is : "+job);
        System.out.println("Employee salary is : "+salary);
    }
    void update(int days){
        this.salary = this.salary/30*days;
    }
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Manager",50000.00);
        emp.calculate();        
        emp.update(5);
        System.out.println("salary for 5 days : ");
        emp.calculate();
    }
}