package me.nimkoes.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyHelloController {

    @Autowired
    MyHelloService myHelloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, " + myHelloService.getName();
    }

}
