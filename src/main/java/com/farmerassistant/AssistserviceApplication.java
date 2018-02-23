package com.farmerassistant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.farmerassistant.mapper")
public class AssistserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssistserviceApplication.class, args);
	}
}
