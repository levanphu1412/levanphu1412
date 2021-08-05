public class Person {
    long id;
    String first_name;
    String last_name;
    String gender;
    String dateOfBirth;
    String country;

    public Person(long id, String first_name, String last_name, String gender, String dateOfBirth, String country) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", first_name='" + first_name + '\'' + ", last_name='" + last_name + '\''
                + ", gender='" + gender + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + ", country='" + country + '\''
                + '}';
    }

}
