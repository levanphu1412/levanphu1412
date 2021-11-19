package vn.techmaster.car.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private String model;
    private String manufacturer;
    private Long price;
    private Long sales;
    private String image;
}
