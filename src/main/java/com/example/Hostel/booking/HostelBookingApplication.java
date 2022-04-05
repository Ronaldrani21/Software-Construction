package com.example.Hostel.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication
@EntityScan(basePackageClasses = { 
		HostelBookingApplication.class,
		Jsr310JpaConverters.class 
})
public class HostelBookingApplication {
	

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(HostelBookingApplication.class, args);
	}

}
