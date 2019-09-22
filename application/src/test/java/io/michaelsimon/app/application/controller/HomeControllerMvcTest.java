package io.michaelsimon.app.application.controller;


import io.michaelsimon.app.AbstractMvcTest;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HomeControllerMvcTest extends AbstractMvcTest {

    @Test
    public void home() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/home").accept(TEXT_HTML_VALUE))
                                       .andExpect(status().isOk())
                                       .andReturn();

        assertEquals(result.getResponse().getContentAsString(), "hat geklappt !!!111einseinseins");
    }

}
