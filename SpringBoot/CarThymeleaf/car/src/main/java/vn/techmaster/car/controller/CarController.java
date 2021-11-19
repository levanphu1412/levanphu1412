package vn.techmaster.car.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vn.techmaster.car.model.Car;
import vn.techmaster.car.model.Search;
import vn.techmaster.car.repository.CarRepo;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepo carRepo;

    @GetMapping
    public String getCar(Model model) {
        model.addAttribute("cars", carRepo.getAll());
        return "home";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable int id, Model model) {
        Optional<Car> car = carRepo.get(id);
        if(car.isPresent()) {
            model.addAttribute("car", car.get());
        }
        return "car";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("car", new Car());
        return "form";
    }

    @PostMapping("/save")
    public String save( Car car, BindingResult result, Model model, RedirectAttributes redirect, int id) {
        Optional<Car> cars = carRepo.get(id);
        if(result.hasErrors()) {
            return "form";
        }
        if(cars.isPresent()){
            carRepo.update(car);
        }else {
            carRepo.add(car);
        }
        return "redirect:/cars";
    }

    @GetMapping(value = "/edit/{id}")
    public String editCar(@PathVariable("id") int id, Model model) {
        Optional<Car> car = carRepo.get(id);
        if(car.isPresent()) {
            model.addAttribute("car", car.get());
        }
        return "form";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable("id") int id){
        carRepo.deleteByID(id);
        return "redirect:/cars";
    }

    @GetMapping("/search")
    public String searchForm(Model model) {
        model.addAttribute("searchrequest", new Search());
        return "search";
    }

    @PostMapping("/search")
    public String searchByKeyword(@ModelAttribute Search search, BindingResult bindingResult, Model model){
        if(!bindingResult.hasFieldErrors()) {
            model.addAttribute("cars", carRepo.searchByKeyword(search.getKeyword()));
        }
        return "home";
    }

    @GetMapping("/sort")
    public String sortByPrice(Model model) {
       
            model.addAttribute("cars", carRepo.sortByPrice());
            
        return "home";
    }


}
