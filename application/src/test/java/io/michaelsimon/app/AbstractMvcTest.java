package io.michaelsimon.app;


import io.michaelsimon.app.application.AbstractSpringTest;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

public abstract class AbstractMvcTest extends AbstractSpringTest {

    @Autowired
    protected WebApplicationContext webApplicationContext;

    protected MockMvc mockMvc;

    @Before
    public final void setUpSuper() {
        this.mockMvc = webAppContextSetup(webApplicationContext)
                .build();
    }
}
