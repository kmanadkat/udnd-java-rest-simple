package com.krupeshanadkat.bootstrap.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("dop-api")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Dogs API")
                        .description("This API returns a list of dogs.")
                        .version("1.0.0")
                        .license(new License().name("MIT").url("https://github.com/kmanadkat/udnd-java-rest-simple?tab=MIT-1-ov-file#readme"))
                        .contact(new Contact().name("Krupesh Anadkat").url("https://krupeshanadkat.com").email("krupeshanadkat16@gmail.com"))
                );
    }

}
