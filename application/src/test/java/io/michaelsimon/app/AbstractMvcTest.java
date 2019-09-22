package io.michaelsimon.app;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

public class AbstractMvcTest extends AbstractSpringTest {

    @Autowired
    protected WebApplicationContext webApplicationContext;

    protected MockMvc mockMvc;

    @Before
    public final void setUpSuper() throws JsonProcessingException {
        this.mockMvc = webAppContextSetup(webApplicationContext)
                .build();
    }
}
