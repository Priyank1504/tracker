package spring.priyank.tracker;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"spring.priyank.tracker","spring.priyank.tracker.controller", "spring.priyank.tracker.entity", "spring.priyank.tracker.service", "spring.priyank.tracker.repository"})
public class Application {
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*/").allowedOrigins("http://mocker.egen.io")
                .allowedMethods("GET", "PUT", "POST", "DELETE", "OPTIONS")
                .allowedHeaders("header1", "header2", "header3")
                .exposedHeaders("header1", "header2")
                .allowCredentials(false).maxAge(3600);
	}

}
