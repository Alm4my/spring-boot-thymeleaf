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
        /// return templates/demo.html
        return ViewNames.DEMO;
    }
}
