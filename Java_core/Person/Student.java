public class Student extends Person {
    private double score;
    private static Long genID = 1L;
    private Long id;

    public Student(String name, String dateOfBirth, String address, String sdt, String email, double score) {
        
        super(name, dateOfBirth, address, sdt, email);
        this.score = score;
        id = genID++;
    }

    public double getScore() {
        return score;
    }

    
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student [Id = " + id + ", name = " + super.getName() + ", dateOfBirth = " + super.getAddress() + ", address = " + super.getAddress() + 
        ", Sđt = " + super.getSdt() + ", email = " + super.getEmail() + ", score = " + score + "]"; 
    }
}
