package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SkillsController {
    @GetMapping
    public String welcome(){return "index";}

    @GetMapping("form")
    public String setNameAndLanguage(){return "form";}

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value="success")
    public String submittedForm(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage, Model model){
        String userName = name;
        String languageOne = firstLanguage;
        String languageTwo = secondLanguage;
        String languageThree = thirdLanguage;
        model.addAttribute("userName", userName);
        model.addAttribute("languageOne", firstLanguage);
        model.addAttribute("languageTwo", secondLanguage);
        model.addAttribute("languageThree", thirdLanguage);
        return "success";
    }
}
