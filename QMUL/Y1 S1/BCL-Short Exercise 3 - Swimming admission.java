// NAME: Brandon Cameron-Lee
// DATE: 09/10/2025
// VERSION: 1
// This program calculates the admission fee of a user entering the swimming pool based on age and employment status

import java.util.Scanner; // Needed to make Scanner available

class SwimmingPoolDiscount {
    // calculates the price of their admission based on their age and employment status
    // prints the discounted price
    //
    public static void main(String [] p) {
        int userAge = checkAge();
        boolean userUnemploymentStatus = checkEmployment();
        boolean userDisablityStatus = checkDisability();
        int price = 12;
    
        printStatus(userAge, userDisablityStatus);
    
        if (userAge < 18) {
            price = price/2;
        }
        else if (userAge >= 60) {
            price = price - 2;
        }
    
        if (userUnemploymentStatus == true) {
            price = price -3;
        }
        
        System.out.println("Your entry price is:  £" + price);    
    }

    // take the user input for a given string and stores it as string and outputs a user input 
    //
    public static String takeInput(String message) {
        Scanner scanner = new Scanner(System.in);
        String answer;
    
        System.out.println(message);
        answer = scanner.nextLine();
    
        return answer;
    }
    
    // takes user input and coverts the string to an int, store as age and returns
    //
    public static int checkAge() {
        int age = Integer.parseInt(takeInput("what is your age?: "));
        return age;
    }
    
    // takes user input for disability converts yes to boolean true, store as disability and returns
    //
    public static boolean checkDisability() {
        String checka1 = takeInput("Do you have any disabilities?(yes/no):  ");
        boolean disability = false;
    
        if ((checka1.toLowerCase()).equals("yes")) {
            disability = true;
        }
        else if ((checka1.toLowerCase()).equals("no")) {
            disability = false;
        }
        else {
            //throw new IllegalArgumentException("answer is not y/n");
            // answer is not y/n -> deal with exception
        }
        
        return disability;
    }
    
    // check employement status
    //
    public static boolean checkEmployment() {
        String checka2 = takeInput("Are you Unemployed(yes/no):  ");
        boolean unEmployed = false;
    
        if ((checka2.toLowerCase()).equals("yes")) {
            unEmployed = true;
        }
        else if ((checka2.toLowerCase()).equals("no")) {
            unEmployed = false;
        }
        else {
            //throw new IllegalArgumentException("answer is not y/n");
            // answer is not y/n -> deal with exception
            // ask about bad input handling in lab -> assumed while loop
        }    
        return unEmployed;
    }
    
    // print the status of age and disability
    //
    public static void printStatus(int ageCS, boolean disabilityCS) {
        System.out.println("user is: " + ageCS + " years old");
        System.out.println("user is disabled: " + disabilityCS);
        return;
    }
} // END class SwimmingPoolDiscount