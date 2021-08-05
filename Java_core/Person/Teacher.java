public class Teacher extends Person {
    private double salary;
    private static Long genID = 1L;
    private Long id;

    public Teacher(String name, String dateOfBirth, String address, String sdt, String email, double salary) {
        super(name, dateOfBirth, address, sdt, email);
        this.salary = salary;
        id = genID++;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Student [Id = " + id + ", name = " + super.getName() + ", dateOfBirth = " + super.getAddress() + ", address = " + super.getAddress() + 
        ", Sđt = " + super.getSdt() + ", email = " + super.getEmail() + ", salary = " + salary +  "]"; 
    }
}
