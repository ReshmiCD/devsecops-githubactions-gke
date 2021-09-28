package com.devsecopsgke.devsecopsgithubactionsgke;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "Demo-DevSecOps Pipeline deploying Java Spring boot application to GKE via Github Actions!";
    }
}
