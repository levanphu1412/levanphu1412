package Generic;

public class Student extends Person {
    private int age;
    private double score;

    public Student(int id, String name, int age, double score) {
        super(id, name);
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
