package techmaster.vn.jpaentity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name="last_name",nullable = false)
    private String lastName;
    @Column(name="gender")
    private String gender;
    @Column(name="address")
    private String address;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="salary")
    private Long salary;
    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DAY")
    private Date bDay;
    @Transient
    private int age;
    public int getAge() {
        Date safeDate = new Date(bDay.getTime());
        LocalDate birthDayInLocalDate = safeDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return Period.between(birthDayInLocalDate, LocalDate.now()).getYears();
    }
    @Transient
    private String fullName;
    public String getFullName() {
        return firstName + " " + lastName;
    }
   


}
