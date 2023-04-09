package com.esh.home.aop.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esh.home.aop.test.Transeport;

@SpringBootTest
class TranseprotTest {

	@Autowired
	private Transeport transeport;
	@Autowired
	private Card card;

	@Test
	void test() {
		
		transeport.takeBus();
		transeport.takeSubway();
		
	}

}