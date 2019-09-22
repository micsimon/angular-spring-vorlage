package io.michaelsimon.app.application.controller;


import io.michaelsimon.app.AbstractMvcTest;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HomeControllerMvcTest extends AbstractMvcTest {

    @Test
    public void home() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/api/home"))
                                       .andExpect(status().isOk())
                                       .andReturn();

        String actual = result.getResponse()
                              .getContentAsString();

        assertEquals("{\"content\":\"hello ... welcome\"}", actual);
    }

}
