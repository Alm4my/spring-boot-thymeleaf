package fr.almamy.springbootthymeleaf.controller;

import fr.almamy.springbootthymeleaf.util.Mappings;
import fr.almamy.springbootthymeleaf.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class UserController {
    @RequestMapping(Mappings.DEMO)
    public String demo(Model model){
        model.addAttribute("message", "Hello Thymeleaf");
        double grade = 90.7;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));

        /// return templates/demo.html
        return ViewNames.DEMO;
    }

    private String convertGPA(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
