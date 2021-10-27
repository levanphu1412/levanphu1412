package vn.techmaster.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.techmaster.company.model.Employee;
import vn.techmaster.company.repository.EmployeeDao;
import vn.techmaster.company.request.SearchRequest;
import vn.techmaster.company.service.StorageService;

import java.util.Optional;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
   

   
    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("employees", employeeDao.getAll());
        return "allemployee";
    }
    @GetMapping(value = "/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        Optional<Employee> employee = employeeDao.get(id);
        if(employee.isPresent()) {
            model.addAttribute("employee", employee.get());
        }
        return "employee";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("employee", new Employee());
        return "form";
    }

    // @PostMapping("/save")
    // public String save(@Valid Employee employee, BindingResult result, RedirectAttributes redirect) {
    //     if(result.hasErrors()) {
    //         return "form";
    //     }
    //     if(employee.getId() > 0){
    //         employeeDao.update(employee);
    //     }else {
    //         employeeDao.add(employee);
    //     }
    //     return "redirect:/employee";
    // }

    @PostMapping(value = "/save", consumes = { "multipart/form-data" })
    public String upload(@Valid @ModelAttribute Employee employee, BindingResult result, RedirectAttributes redirect, Model model) {
      if (employee.getPhoto().getOriginalFilename().isEmpty()) {    
        result.addError(new FieldError("person", "photo", "Photo is required"));
      }
      if (result.hasErrors()) {
        return "form";
      }if(employee.getId() > 0) {
          employeeDao.update(employee);
      }else{  
         
        employeeDao.add(employee);
      }
      
      return "redirect:/employee";
    }
  

    @GetMapping(value = "/edit/{id}")
    public String editEmployeeId(@PathVariable("id") int id, Model model) {
        Optional<Employee> employee = employeeDao.get(id);
        if(employee.isPresent()) {
            model.addAttribute("employee", employee.get());
        }
        return "form";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable("id") int id){
        employeeDao.deleteById(id);
        return "redirect:/employee";
    }

    @GetMapping("/search")
    public String searchForm(Model model) {
        model.addAttribute("searchrequest", new SearchRequest());
        return "search";
    }

    @PostMapping("/search")
    public String searchByKeyword(@ModelAttribute SearchRequest request, BindingResult bindingResult, Model model){
        if(!bindingResult.hasFieldErrors()) {
            model.addAttribute("employees", employeeDao.searchByKeyword(request.getKeyword()));
        }
        return "allemployee";
    }
}
