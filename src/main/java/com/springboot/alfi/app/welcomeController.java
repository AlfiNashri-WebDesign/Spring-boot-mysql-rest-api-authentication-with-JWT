package com.springboot.alfi.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*nama file java buat test aja*/
public class welcomeController {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Selamat datang di web pertama saya dengan java";
    }
}

