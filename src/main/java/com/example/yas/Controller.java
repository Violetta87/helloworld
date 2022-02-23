package com.example.yas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Controller {

    @GetMapping("/friendlyMessage")
    public String message(){
        return "hej med dig";
    }

    @GetMapping("/echo")
    public String message(@RequestParam String input){
        return input;
    }

    @GetMapping("/erdetfredag")
    public String erdetFredag(){
        LocalDate date = LocalDate.now();
        String dagYas = "fredag";
        if(date.equals(dagYas)) {

            return "Er det fredag?"+ "<br>" + "\nja" ;
        }else{
            System.out.println("er det fredag");
            System.out.println("nej");
                return "Er det fredag ?" + "<br>" + "nej";
            }
    }


}
