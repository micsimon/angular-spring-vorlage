package io.michaelsimon.app.application.controller;

import io.michaelsimon.app.backend.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController extends AbstractController {

    @Autowired
    private DummyService dummyService;

    @RequestMapping(method = GET, path = "/home", produces = TEXT_HTML_VALUE)
    @ResponseBody
    public String index() {
        return dummyService.sayHello();
    }

}
