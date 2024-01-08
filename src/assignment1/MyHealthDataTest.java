/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Oct 15
 * Description: A program to help create patients’ health records 
 * during their first time in the hospital.
 */ 
/**
 * Assignment1 package is to get patient's input and report patient's health data.
 * @author JingYi Li
 */
package assignment1;
import java.time.LocalDate;
import java.util.Scanner;
/**
 * MyHealthDataTest class is to get patient's input and report patient's health data.
 * @author JingYi Li
 */
public class MyHealthDataTest {

	public static void main(String[] args) {
		
		/**
		 * to get the current year.
		 */
		LocalDate currentdate = LocalDate.now();
		int currentYear = currentdate.getYear();
		
		Scanner sr = new Scanner(System.in); 
		
		System.out.println("PATIENTS' HEALTH RECORDS");
		System.out.print("Enter the first name: ");
		String firstName = sr.nextLine();
		
		System.out.print("Last name: ");
		String lastName = sr.nextLine();
		
		System.out.print("Gender (M/F): ");
		String gender = sr.nextLine();
		
		System.out.print("Year of birth: ");
		int birthYear = sr.nextInt();
		
		System.out.print("Height (in inches): ");
		double height = sr.nextDouble();
		
		System.out.print("Weight (in pounds): ");
		double weight = sr.nextDouble();

		/**
		 * Creates an object of MyHealthData to storage all the information from patient input.
		 */
		MyHealthData patientData = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
		
		/**
		 * Call the displayMyHealthDate method to report the result.
		 */
		patientData.displayMyHealthData();
			
		sr.close();
		
	}

}
