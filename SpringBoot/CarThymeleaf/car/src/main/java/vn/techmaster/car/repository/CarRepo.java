package vn.techmaster.car.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import vn.techmaster.car.model.Car;

@Repository
public class CarRepo {

    private List<Car> cars = new ArrayList<Car>();

     public CarRepo() {
        try {
            File file = ResourceUtils.getFile("classpath:static/car.json");
            ObjectMapper mapper = new ObjectMapper();
            cars.addAll(mapper.readValue(file, new TypeReference<List<Car>>(){}));
            
          } catch (IOException e) {
              System.out.println(e.getMessage());
          }    
        }
      
    
    public List<Car> getAll() {
       
        return cars;
    }

   
    public Optional<Car> get(int id) {
        
        return cars.stream().filter(c -> c.getId() == id).findFirst();
    }

   
    public void add(Car car) {
       cars.add(car);
    }

    public void update(Car car) {
       
        get(car.getId()).ifPresent(exisCar -> {
            exisCar.setModel(car.getModel());
            exisCar.setManufacturer(car.getManufacturer());
            exisCar.setPrice(car.getPrice());
            exisCar.setSales(car.getSales());
            exisCar.setImage(car.getImage());
        });
        
    }


    public void deleteByID(int id) {
       get(id).ifPresent(exis -> cars.remove(exis));
        
    }

    
    public void delete(Car car) {
       
        deleteByID(car.getId());
    }

    public List<Car> searchByKeyword(String keyword) {
        
        return cars.stream().filter(car -> car.getModel().toLowerCase().contains(keyword.toLowerCase())
         || car.getManufacturer().toLowerCase().contains(keyword.toLowerCase()))
         .collect(Collectors.toList());
    }

    public List<Car> sortByPrice() {
        return cars.stream().sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())).collect(Collectors.toList());
    }
    
}
