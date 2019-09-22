package io.michaelsimon.app;

import io.michaelsimon.app.application.Main;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = {Main.class})
@WebAppConfiguration
public class AbstractSpringTest {

}
