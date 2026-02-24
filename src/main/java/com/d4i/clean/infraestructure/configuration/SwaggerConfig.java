package com.d4i.clean.infraestructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public-apis")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    private OpenAPI customOpenApi() {
        return new OpenAPI().info(new Info().title("Soy OscarMeneses").description("Apis realizadas con clean arquitecture")
                .termsOfService("https://www.unsch.edu.pe").license( new License().name("UNSCH").url("https://www.unsch.edu.pe"))
                .version("1.0"));
    }

}
