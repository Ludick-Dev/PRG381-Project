/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PRG381_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.PRG381_Project.domain.Student;
import com.example.PRG381_Project.service.StudentService;

@Controller
public class StudentController {
    
     @Autowired
        private StudentService service;
        @GetMapping("/")
        public String viewHomePage(Model model) {
            List<Student> liststudent = service.listAll();
            model.addAttribute("liststudent", liststudent);
            System.out.print("Get / ");    
            return "index";
        }
        @GetMapping("/register")
        public String add(Model model) {
            model.addAttribute("student", new Student());
            return "register";
        }
        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String saveStudent(@ModelAttribute("student") Student std) {
            service.save(std);
            return "redirect:/";
        }
        @RequestMapping("/edit/{id}")
        public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
            ModelAndView mav = new ModelAndView("new");
            Student std = service.get(id);
            mav.addObject("student", std);
            return mav;
            
        }
        @RequestMapping("/delete/{id}")
        public String deletestudent(@PathVariable(name = "id") int id) {
            service.delete(id);
            return "redirect:/";
        }
}
