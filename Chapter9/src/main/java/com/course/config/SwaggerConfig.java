package com.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fusanping
 * @date 2024年10月30日 18:48
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select().paths(PathSelectors.regex("/.*")).build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("我的接口文档").contact(new Contact("fspb124","","fspb124@163.com")).description("这是我的swagger生成的接口文档").version("1.0.0.0").build();
    }
}
