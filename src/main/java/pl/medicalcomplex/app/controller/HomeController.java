package pl.medicalcomplex.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    private String index(){
        return "index";
    }

    @PostMapping("/login")
    public String loginAction(){
        //TODO dokończyć logowanie
        return null;
    }

}
