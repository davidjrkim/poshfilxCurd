package kr.sharemind.poshfilxCrud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class poshController {

    @GetMapping
    public String index() {
        return "index";
    }

}