/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PRG381_Project.htmlcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.PRG381_Project.domain.Student;
import com.example.PRG381_Project.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author rulud
 */

@Controller
public class studentController {
    
    @Autowired
    private StudentService service;
        //@RequestMapping(value = "/save", method = RequestMethod.POST)
        @PostMapping("/register")
        public String saveStudent(@ModelAttribute("student") Student std) {
            service.save(std);
            return "redirect:/main";
        }
}
 