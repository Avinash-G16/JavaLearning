package com.avinash;
import com.avinash.service.PurchaseCourse;
import com.learning.dao.JavaCourse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPurchaseCourse {

	@Test
	void testProceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
		//assertTrue(status);
		assertFalse(status, "It fails because unit results in true");//message gets displayed only case of failed test case
//		fail("Not yet implemented");
	}
}
