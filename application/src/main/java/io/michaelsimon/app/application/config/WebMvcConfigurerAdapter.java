package io.michaelsimon.app.application.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AutoConfigureAfter({CacheAutoConfiguration.class, JacksonAutoConfiguration.class,
        RestTemplateAutoConfiguration.class})
public class WebMvcConfigurerAdapter implements WebMvcConfigurer {

    private static final String APP_URI = "/app";

    private static final String APP_URI_WITH_SLASH = APP_URI + "/";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(APP_URI)
                .setViewName("redirect:" + APP_URI_WITH_SLASH);
        registry.addViewController(APP_URI_WITH_SLASH)
                .setViewName("redirect:" + APP_URI_WITH_SLASH + "index.html");
        registry.addViewController("/")
                .setViewName("redirect:" + APP_URI_WITH_SLASH);
    }
}
