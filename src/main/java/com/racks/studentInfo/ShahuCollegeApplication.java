package com.racks.studentInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.racks.studentInfo","ServiceRahul"})
public class ShahuCollegeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShahuCollegeApplication.class, args);
	}

}
