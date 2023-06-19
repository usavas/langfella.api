package com.appicient.langfella;

import com.appicient.langfella.application.databaseports.ReadingDao;
import com.appicient.langfella.application.databaseports.models.Reading;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LangfellaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LangfellaApplication.class, args);
		System.out.println("hello");
	}

	@Bean
	CommandLineRunner commandLineRunner(ReadingDao readingDao){
		return args -> {
			readingDao.save(new Reading("Sample Title", "www.appicient.com"));
		};
	}
}
