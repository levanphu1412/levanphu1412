package vn.techmaster.company.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Locale;

public class Employee {
    @JsonIgnore
    int id;

    String firstName;
    String lastName;
    String email;
    String passportNumber;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }


    public boolean matchWithKeyword(String keyword) {
        String keywordLowerCase = keyword.toLowerCase();
        return ((firstName.toLowerCase() + " " + lastName.toLowerCase()).contains(keywordLowerCase) ||
                (email.toLowerCase().contains(keywordLowerCase)));
    }
}
