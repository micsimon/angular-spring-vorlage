package io.michaelsimon.app.controller;

import io.michaelsimon.app.service.DummyService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.String.format;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;

@Test
public class HomeControllerTest {

    @InjectMocks
    private HomeController underTest;

    @Mock
    private DummyService dummyService;

    private String expect;
    private String actual;

    @BeforeMethod
    public void setup() {
        underTest = new HomeController();
        initMocks(this);

        expect = "expected string";
        when(dummyService.sayHello()).thenReturn(expect);
    }

    public void index_ok() {
        execute();

        assertEquals(actual, expect, format("'%s' must be '%s'", actual, expect));

    }

    private void execute() {
        this.actual = underTest.index();
    }

}