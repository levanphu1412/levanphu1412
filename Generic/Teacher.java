package Generic;

public class Teacher extends Person {
    private Long salary;

    public Teacher(int id, String name, Long salary) {
        super(id, name);
        this.salary = salary;
    }


    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", salary=" + salary +
                '}';
    }
}
