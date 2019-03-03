package com.springboot.MavenProfiling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenProfilingApplication {

	private static final Logger logger = LoggerFactory.getLogger(MavenProfilingApplication.class);

	public static String host;

	@Value("${host}")
	public void setHost(String h) {
		host = h;
	}

	public static void main(String[] args) {
		logger.info("MavenProfilingApplication - Spring Boot started!");
		SpringApplication.run(MavenProfilingApplication.class, args);

		logger.trace("trace me " + host);
		logger.debug("debug me " + host);
		logger.info("info me " + host);
		logger.warn("warn me " + host);
		logger.error("error me " + host);

	}

}
