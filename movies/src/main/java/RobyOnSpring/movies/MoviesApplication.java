package RobyOnSpring.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer()
		{
			public void addCorsMapping(CorsRegistry regs) {
				regs.addMapping("/**").allowedOrigins("*");
			}
		};
	}
}

// https://cloud.mongodb.com/v2/6407761d62544b291143966a#/clusters/commandLineTools/Cluster0
