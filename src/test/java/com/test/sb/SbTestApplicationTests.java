package com.test.sb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbTestApplicationTests {
	public static Logger log = LoggerFactory.getLogger(SbTestApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Test case executing....");
		assertEquals(true, true);
	}

}
