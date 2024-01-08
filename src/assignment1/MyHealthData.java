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
/**
 * This system maintains important health information about a patient.
 * This class store
 * @author jingYi Li
 */
public class MyHealthData extends MyHealthDataBase {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private final int currentYear;
	//int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	private double height;
	private double weight;
	
    /**
     * Default constructor for MyHealthData.
     * Initializes the object with default values.
     */
    public MyHealthData() {
        this.firstName = "";
        this.lastName = "";
        this.gender = "";
        this.height = 0.0;
        this.weight = 0.0;
        this.birthYear = 0;
        this.currentYear = 0;
    }

	/**
	 * This constructor sets health information from a patient.
	 * @param firstName of patient
	 * @param lastName of patient
	 * @param gender of patient
	 * @param height of patient
	 * @param weight of patient
	 * @param birthYear of patient
	 * @param currentYear 
	 */
    public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }
	
    /**
     * Returns first name for MyHealthData.
     * @return first name for MyHealthData.
     */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets first name from a patient.
	 * @param firstName from a patient.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Returns first name for MyHealthData.
	 * @return last name for MyHealthData.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets last name from a patient.
	 * @param lastName from a patient.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns gender for MyHealthData. 
	 * @return gender for MyHealthData.
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets gender of a patient.
	 * @param gender of a patient.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Returns the year of birth for MyHealthData.
	 * @return the year of birth for MyHealthData.
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	/**
	 * Sets the year of birth from a patient.
	 * @param birthYear the year of birth from a patient.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * The current year can not be adjusted once set.
	 * @param currentYear from patient's input
	 * @return currentYear for MyHealthData.
	 */
	public int getCurrentYear(int currentYear) {
		return currentYear;
	}
	
	/**
	 * Returns height for MyHealthData. 
	 * @return height for MyHealthData.
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets height of a patient.
	 * @param height of a patient.
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Returns weight for MyHealthData. 
	 * @return weight for MyHealthData.
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Sets height of a patient.
	 * @param weight of a patient.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	} 
	
	/**
	 * Calculates patient's age by using currentYear - birthYear.
	 * @return an <code>integer</code> of patient's age.
	 */
	public int getAge() {
		return currentYear - birthYear;
	}
	
	/**
	 * Calculates patient's max heart rate.
	 * @return an <code>integer</code> of patient's max heart rate.
	 */
    public int getMaxHeartRate() {
        return 220 - getAge();
    }
    
    /**
     * Calculates mix and max target heart rate and get the range of target heart rate.
     * @return a <code>String</code> representation of the target heart rate range.
     */
    public String getTargetHeartRateRange() {
    	int getMinTHR = (int)(getMaxHeartRate() * 0.5);
    	int getMaxTHR = (int)(getMaxHeartRate() * 0.85);
    	return String.format("%d - %d", getMinTHR, getMaxTHR);
    }
    
    /**
     * Gets BMI value from MyHealthDataBase superclass. 
     * @return a <code>double</code> of the value of BMI.
     */
    public double calculateBMI() {
    	return calculateBMI(weight, height);
    }
    
    /**
     * Gets an incorrect BMI value from MyHealthDataBase superclass for testing. 
     * @return a <code>double</code> of the value of BMI that is incorrect.
     */
    public double incorrectBMI() {
    	return incorrectBMI(weight, height);
    }
    
    /**
     * A report of patient's health data.
     */
    public void displayMyHealthData() 
    { 

    	System.out.printf("%nPATIENT'S HEALTH DATA%n");
    	System.out.printf("Full name: %s %s%n", firstName , lastName);
    	System.out.printf("Gender: %s, Age: %d%n", gender , getAge());
    	System.out.printf("Year of Birth: %d%n", birthYear);
    	System.out.printf("Height: %.2f inches%n", height);
    	System.out.printf("Weight: %.2f pounds%n", weight);
    	System.out.printf("BMI: %.2f%n", calculateBMI());
    	System.out.printf("Maximum heart rate: %d%n", getMaxHeartRate());
    	System.out.printf("Target heart rate range: %s%n%n", getTargetHeartRateRange());

    	System.out.println("BMI VALUES");
    	System.out.println("Underweight: less than 18.5");
    	System.out.println("Normal:      between 18.5 and 24.9");
    	System.out.println("Overweight:  between 25 and 29.9");
    	System.out.println("Obese:       30 or greater");   
       
    	System.out.println("\nThe program is designed by JingYi Li");
    }

} 