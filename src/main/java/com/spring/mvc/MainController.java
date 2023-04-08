package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/")
    public  String main(Model model){
        model.addAttribute("car", new Car());
        return "index";
    }

    @GetMapping("/show/car")
    public String showName(@Valid @ModelAttribute("car") Car car, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "index";
        }
        return "show_car";
    }
}
