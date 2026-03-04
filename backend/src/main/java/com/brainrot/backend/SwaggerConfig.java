package com.brainrot.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI brainRotOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Brain Rot API")
                        .description("API documentation for Brain Rot App Backend")
                        .version("1.0"));
    }
}
