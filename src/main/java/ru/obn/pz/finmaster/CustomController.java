package ru.obn.pz.finmaster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping("/")
    public String test (){
        return "Я работаю, не мешай!";
    }

}
