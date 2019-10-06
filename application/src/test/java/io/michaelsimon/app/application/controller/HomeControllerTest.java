package io.michaelsimon.app.application.controller;

import io.michaelsimon.app.AbstractMvcTest;
import io.michaelsimon.app.application.controller.home.HomeController;
import io.michaelsimon.app.application.model.HomeResponse;
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
    private HomeResponse actual;

    @Before
    public void setup() {
        underTest = new HomeController();
        initMocks(this);

        expect = "expected string";
        when(dummyService.sayHello()).thenReturn(expect);
    }

    @Test
    public void home_ok() {
        execute();

        assertEquals(actual.getContent(), expect);

    }

    private void execute() {
        this.actual = underTest.home();
    }

}
