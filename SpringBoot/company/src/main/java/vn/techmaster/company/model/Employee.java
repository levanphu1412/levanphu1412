package vn.techmaster.company.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
   @JsonIgnore
   private int id;
   @Size(min = 2, max = 10, message = "First Name must between 2 and 10")
   private String firstName;
   @Size(min = 2, max = 10, message = "Last Name must between 2 and 10")
   private String lastName;
   @NotBlank(message = "Email cannot null")
   @Email(message = "Not valid email")
   private String email;
   @Size(min = 7, max = 20, message = "Passport must between 7 and 20")
   private String passportNumber;
   @JsonIgnore
   private String image;
   @JsonIgnore
   private MultipartFile photo;
   

    public boolean matchWithKeyword(String keyword) {
        String keywordLowerCase = keyword.toLowerCase();
        return ((firstName.toLowerCase() + " " + lastName.toLowerCase()).contains(keywordLowerCase) ||
                (email.toLowerCase().contains(keywordLowerCase)));
    }
}
