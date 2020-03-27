package com.Assigments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitAssertions {

	@Before
	public static void beforeClass() {

	}

	@After
	public void after() {

	}

	@Test
	public void assertNull() {

		Assert.assertNull("Fail", "Exception");

	}

	@Test
	public void asserNotNull() {

		assertNotNull("Json");
	}

	@Test
	public void asserEquals() {

		assertEquals("Alert", "Alert");

	}

}
