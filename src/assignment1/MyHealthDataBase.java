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
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Daniel Cormier
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/

public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    /**
     * This method returns an incorrect result of calculating patient's BMI.
     * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
     * @return a <code>double</code> of the result of calculating patient's BMI.
     */
    public double incorrectBMI(double weightParam, double heightParam)
    {
        return weightParam + 703 / (heightParam * heightParam);
    }
}