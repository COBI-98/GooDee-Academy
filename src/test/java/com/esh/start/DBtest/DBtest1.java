package com.esh.start.DBtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DBtest1 {

	@Test
	void testPlus() {
		assertEquals(5, new DBtest().plus(2, 3));
	}

}
