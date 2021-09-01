package pl.medicalcomplex.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    private String index(){
        return "index";
    }

    @PostMapping("/login")
    public String loginAction(){
        //TODO dokończyć logowanie
        return null;
    }

}
