package io.michaelsimon.app.controller;


import io.michaelsimon.app.AbstractMvcTest;
import org.springframework.test.web.servlet.MvcResult;
import org.testng.annotations.Test;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.testng.Assert.assertEquals;

@Test
public class HomeControllerTest extends AbstractMvcTest {

    public void home() throws Exception {
        MvcResult result = this.mockMvc.perform(get("/home").accept(TEXT_HTML_VALUE))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(result.getResponse().getContentAsString(), "hat geklappt !!!111einseinseins");
    }

}