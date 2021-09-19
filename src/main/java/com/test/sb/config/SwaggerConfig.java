package com.test.sb.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.models.Contact;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	public Docket productAPI() {
		return new Docket(
				DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.test.sb"))
				// .paths("/emp.*")
				//.apiInfo(metaInfo())
				.build().apiInfo(metaInfo());
	}

	@SuppressWarnings("deprecation")
	private ApiInfo metaInfo() {
		System.out.println("Test====");
		return new ApiInfo("Spring Boot Swagger Demo", 
				"Spring Boot Swagger Demo Documentation", 
				"1.0", 
				"Terms of Service",
		          new Contact().name("Sree Techies").url("http://www.google.com").email("http://www.gmail.com").toString(), 
		          "Spring Boot Swagger Demo 2.0", 
		          "http://www.google.com/LICENSE-2.0");
	}

}
