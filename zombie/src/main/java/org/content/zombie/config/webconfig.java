
package org.content.zombie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webconfig {

@Bean
    public WebMvcConfigurer corsconfigurer(){
    return new WebMvcConfigurer(){

        public void addcorsMappings(CorsRegistry registry){
            registry.addMapping("/**"
            )       .allowedOrigins("*")
                    .allowedMethods("SET","POST","PUT","DELETE")
                    .allowedHeaders("*");
        }
    };
}
}