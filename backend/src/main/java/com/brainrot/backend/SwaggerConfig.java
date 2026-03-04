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
                    .title("Brain Rot Backend API")
                    .description("Backend services for Brain Rot social platform")
                    .version("1.0")
                    .contact(new io.swagger.v3.oas.models.info.Contact()
                            .name("Brain Rot Team")
                            .email("support@brainrot.app")));
}
}
