package io.michaelsimon.app.backend.service;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DummyServiceTest {

    private DummyService underTest;

    @Before
    public void setup() {
        underTest = new DummyService();
    }

    @Test
    public void dummy() {
        String actual = underTest.sayHello();

        assertEquals("hello ... welcome", actual);
    }

}
