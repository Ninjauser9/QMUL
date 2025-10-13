// Brandon Cameron-Lee
// 06/10/2025
// VERSION 1
// Program to calculate the fitness age of user by taking an average of their test scores
// and calculating their fitness age with the scores
// additionally compare the fitness age of the user to their true age.

import java.util.Scanner; // Needed to make Scanner available

class FitCalc
{
    public static void main(String [] p) { //main
        Integer age = inputAge();
        Integer score1 = inputExercise1Score();
        Integer score2 = inputExercise2Score();
        Integer scoreAvg = scoreAverage(score1, score2);
        Integer fitnessAge = calculateFitnessAge(scoreAvg);
        Integer ageDiff = ageDifference(age, fitnessAge);
    
        System.out.println("Your average score is " + scoreAvg);
        System.out.println("Your Fitness age is " + fitnessAge + " years old");
        System.out.println("You are " + ageDiff + " away from your fitness age");
    
    } //END main
    
    //This method takes the users input for age and coverts the string to an integer, and returns score1
    //
    public static Integer inputAge() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter age: ");
    Integer age = Integer.parseInt(scanner.nextLine());
    return age;
    } //END
    
    //This method takes the users input for age and coverts the string to an integer, and returns score1
    //
    public static Integer inputExercise1Score() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score from exercise 1: ");
        Integer score1 = Integer.parseInt(scanner.nextLine());
        return score1;
    } //END
    
    //This method takes the users input for age and coverts the string to an integer, and returns score2
    //
    public static Integer inputExercise2Score() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score from exercise 2: ");
        Integer score2 = Integer.parseInt(scanner.nextLine());
        return score2;
    } //END
    
    //This method takes the average of score 1 and score 2 by adding them, diving by 2 and rounding them down to the nearest whole number with mathfloor
    //
    public static Integer scoreAverage(Integer score1, Integer score2) {
        Double scoreAvg = Math.floor((score1 + score2)/2);
        return scoreAvg.intValue();
    } //END
    
    //This method takes the score average and multiplies it by the fitness multiplier for the users fitness age
    //
    public static Integer calculateFitnessAge(Integer scoreAvg) {
        final Double FITNESS_MULTIPLIER = 1.6;
        Double fitnessAge = Math.ceil((scoreAvg * FITNESS_MULTIPLIER)+10);
        
        return fitnessAge.intValue();
    } //END
    
    //This method takes difference between the users age and fitness age and calculates the difference between them
    //
    public static Integer ageDifference(Integer age, Integer fitnessAge){
        Integer fitnessAgeInt = fitnessAge.intValue();
        Integer ageDiff = (age - fitnessAgeInt);
        return ageDiff;
    } //END
} // END class name