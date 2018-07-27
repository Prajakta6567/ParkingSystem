package test.design.parkingsystem;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestDriver.class);

		for (Failure failure : result.getFailures()) {
			System.err.println(failure.toString());
		}

		System.out.println("SUCCESS: " + result.wasSuccessful());
	}
}