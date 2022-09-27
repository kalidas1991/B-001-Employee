package com.bytebrains.employee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * User : Kalidas Daundkar
 * Description : This class is used to set the response according to mediaType
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * @param configurer
     * Description : Override configureContentNegotiation method and add response media type as JSON and XML
     *                   By default media type is JSON
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
                .parameterName("mediaType")
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("xml", MediaType.APPLICATION_XML)
                .mediaType("json", MediaType.APPLICATION_JSON);
    }
}
