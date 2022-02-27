package com.example.ApiJava;

import com.example.ApiJava.model.Legislator;
import com.example.ApiJava.repository.LegislatorRepository;
import com.example.ApiJava.service.LegislatorService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ApiJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LegislatorService legislatorService){
		return args -> {
			//read and write to db
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TypeReference<List<Legislator>> typeReference = new TypeReference<List<Legislator>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/legislator.json");
			try {
				List<Legislator> legislators = mapper.readValue(inputStream,typeReference);
				legislatorService.addLegislator(legislators);
				System.out.println("legislators Saved!");
			} catch (IOException e){
				System.out.println("Unable to save legislators: " + e.getMessage());
			}


		};


	}

}
