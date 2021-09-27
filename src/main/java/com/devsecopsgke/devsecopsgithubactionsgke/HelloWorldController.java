package com.devsecopsgke.devsecopsgithubactionsgke;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "Java - DevSecOps Pipeline deploying to GKE Via Github Actions!";
    }
}
