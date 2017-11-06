package com.example.dateboot;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/")

    public String homePage(Model model){
        LocalDate today = LocalDate.now();
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter weekF= DateTimeFormatter.ofPattern("EEEE");
        String dateNow=today.format(dTF);
        String weekDay=today.format(weekF);

        model.addAttribute ("myDate",dateNow);
        model.addAttribute ("weekDay", weekDay);
        return"date";
    }

}
