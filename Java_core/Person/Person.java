public class Person {
    private static Long genID = 1L;
    private Long id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String sdt;
    private String email;
    
    public Person(String name, String dateOfBirth, String address, String sdt, String email) {
        id = genID++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.setSdt(sdt);
        this.setEmail(email);
    }

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = Validation.validateMobile(sdt);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    public String toString() {
        return "Person [Id = " + id + ", name = " + name + ", dateOfBirth = " + dateOfBirth + ", address = " + address + 
        ", Sđt = " + sdt + ", email = " + email + "]"; 
    }
}