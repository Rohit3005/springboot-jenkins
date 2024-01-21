package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Application tested...");
		Assertions.assertEquals(true, true);
	}

}
