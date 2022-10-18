package org.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngTask {

	@Test(groups = "Smoke")
	private void tc01() {

		Assert.assertTrue(false);
		System.out.println("Test 1: Smoke");

	}

	@Test(groups = "Fire", dependsOnGroups = "Smoke")
	private void tc02() {

		System.out.println("Test 2: Fire");

	}

	@Test(groups = "Air")
	private void tc03() {

		System.out.println("Test 3: Air");

	}

	@Test(groups = "Smoke")
	private void tc04() {

		System.out.println("Test 4: Smoke");

	}

	@Test(groups = "Fire")
	private void tc05() {

		System.out.println("Test 5: Fire");

	}

	@Test(groups = "Air")
	private void tc06() {

		System.out.println("Test 6: Air");

	}

	@Test(groups = "Smoke")
	private void tc07() {

		System.out.println("Test 7: Smoke");

	}

	@Test(groups = "Fire")
	private void tc08() {

		System.out.println("Test 8: Fire");

	}

	@Test(groups = "Air")
	private void tc09() {

		System.out.println("Test 9: Air");

	}

	@Test(groups = "Smoke")
	private void tc10() {

		System.out.println("Test 10: Smoke");

	}

}
