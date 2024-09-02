/**
* @packageName	: com.lguplus.pc.config
* @fileName		: SwaggerConfig.java
* @author		: 83474
* @date			: 2024.08.22
* @description	:
* ===========================================================
* DATE              AUTHOR             NOTE
* -----------------------------------------------------------
* 2024.08.22        83474       	최초 생성
*/
package com.lguplus.pc.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
		info = @Info(title = "LG Uplus", 
		description = "LG Uplus용 API 명세", 
		version = "v1")
		)
public class SwaggerConfig {

	@Bean
    GroupedOpenApi getExampleApi() { 
		String[] paths = {"/example/**"};
    
        return GroupedOpenApi
            .builder()
            .group("LG Uplus API v1")
            .pathsToMatch(paths)
            .build();

    }

}
