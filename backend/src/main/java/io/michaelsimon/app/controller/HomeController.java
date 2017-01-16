package io.michaelsimon.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @RequestMapping(method = GET, path = "/home")
    @ResponseBody
    public String index() {
        return "Hat geklappt";
    }

}
