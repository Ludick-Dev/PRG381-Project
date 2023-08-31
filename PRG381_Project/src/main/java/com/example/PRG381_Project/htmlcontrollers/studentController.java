/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PRG381_Project.htmlcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.PRG381_Project.domain.Student;
//import com.example.PRG381_Project.domain.Admin;
import com.example.PRG381_Project.service.StudentService;
import com.example.PRG381_Project.repository.AdminRepository;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class studentController {
    
    @Autowired
    private StudentService service;
        //@RequestMapping(value = "/save", method = RequestMethod.POST)
        @PostMapping("/register")
        public String saveStudent(@ModelAttribute("student") Student std) {
            service.save(std);
            return "redirect:/";
        }
        
    private AdminRepository repo;
    
    @GetMapping("/")
    public String login(Model model){
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "login";
    }
    
    
    @PostMapping("/main")
    public String mainPage(@ModelAttribute("admin")Admin admin, Model model){
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());
        
        String username = admin.getUsername();
        String password = admin.getPassword();
        Admin adminData = repo.findByUsernameAndPassword(username, password);
        
        if (adminData != null) {
            if (admin.getUsername().equals(adminData.getUsername())) {
                return "main";
            }   
            else{
                return "login";
            }
        }
        else{
            System.out.println("Optional is empty");
            System.out.println("Incorrect credentials");
            return "login";            
        }
    }
    @GetMapping("/register")
    public String showRegistrationPage() {
        return "register"; 
    }
}
 