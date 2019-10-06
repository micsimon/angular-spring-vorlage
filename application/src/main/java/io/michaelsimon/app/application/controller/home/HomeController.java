package io.michaelsimon.app.application.controller.home;

import io.michaelsimon.app.application.controller.AbstractController;
import io.michaelsimon.app.application.model.HomeResponse;
import io.michaelsimon.app.backend.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController extends AbstractController {

    @Autowired
    private DummyService dummyService;

    @RequestMapping(method = GET, path = "/home", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public HomeResponse home() {
        return new HomeResponse(dummyService.sayHello());
    }

}
