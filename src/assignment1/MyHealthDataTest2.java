/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Oct 15
 * Description: A Junit testing to test all methods in MyHealthData class.
 */ 
/**
 * Assignment1 package is to get patient's input and report patient's health data.
 * @author JingYi Li
 */
package assignment1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
/**
 * Junit testing to test all methods in MyHealthData class.
 * @author JingYi Li
 */
public class MyHealthDataTest2 {
	
	//This test is incorrect because the BMI formula from MyHealthDataBase class is wrong.
	//"weightParam + 703 / (heightParam * heightParam)" should be "weightParam * 703 / (heightParam * heightParam)".
	/**
	 * for testing an incorrect BMI calculation. 
	 */
	@Test
	public void testIncrrectBMI() {
		MyHealthData patient = new MyHealthData("Mini", "Don", "M", 70.0, 160.0, 1996, 2023);
		assertEquals(22.96, patient.incorrectBMI(), 0.01);
		patient = null;
	}
	
	/**
	 * for testing CalculateBMI method.
	 */
	@Test
	public void testCalculateBMI() {
		MyHealthData patient = new MyHealthData("Mini", "Don", "M", 70.0, 160.0, 1996, 2023);
		assertEquals(22.96, patient.calculateBMI(), 0.01);
		patient = null;
	}
	
	/**
	 * for testing testGetAge method.
	 */
	@Test
	public void testGetAge() {
		MyHealthData patient = new MyHealthData("Joe", "King", "F", 61.14, 121.25, 1992, 2023);
		assertEquals(31, patient.getAge());
		patient = null;
	}
	
	/**
	 * for testing getMaxHeartRate method.
	 */
	@Test
	public void testGetMaxHeartRate() {
		MyHealthData patient = new MyHealthData("Ussopo", "Shan", "F", 70.0, 160.0, 1990, 2023);
		assertEquals(187, patient.getMaxHeartRate());
		patient = null;
	}
	
	/**
	 * for testing getTargetHeartRateRange method.
	 */
	@Test
	public void testGetTargetHeartRateRange() {
		MyHealthData patient = new MyHealthData("John", "Doe", "M", 70.0, 160.0, 1990, 2023);
		assertEquals("93 - 158", patient.getTargetHeartRateRange());
		patient = null;
	}
		
}

