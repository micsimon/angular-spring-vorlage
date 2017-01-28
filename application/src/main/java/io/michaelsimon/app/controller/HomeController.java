package io.michaelsimon.app.controller;

import io.michaelsimon.app.backend.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @Autowired
    private DummyService dummyService;

    @RequestMapping(method = GET, path = "/home")
    @ResponseBody
    public String index() {
        return dummyService.sayHello();
    }

}
