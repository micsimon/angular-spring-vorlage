package io.michaelsimon.app.application.controller;

import io.michaelsimon.app.AbstractMvcTest;
import io.michaelsimon.app.backend.service.DummyService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class HomeControllerTest extends AbstractMvcTest {

    @InjectMocks
    private HomeController underTest;

    @Mock
    private DummyService dummyService;

    private String expect;
    private String actual;

    @Before
    public void setup() {
        underTest = new HomeController();
        initMocks(this);

        expect = "expected string";
        when(dummyService.sayHello()).thenReturn(expect);
    }

    @Test
    public void index_ok() {
        execute();

        assertEquals(actual, expect);

    }

    private void execute() {
        this.actual = underTest.index();
    }

}
