// NAME: Brandon Cameron-Lee
// DATE: 13/10/2025
// VERSION: 1
// BRIEF OVERVIEW OF PURPOSE: the purpose of this code is a double or quit quiz (cash out is doubled or halved depending on result) 

import java.util.Scanner; // Needed to make Scanner available

//quiz record introduced
//
class Quiz {
    String question;
    String correctAnswer;
}

class DoubleOrQuit
{
    // run the quiz and introduce the cash system
    //
    public static void main(String [] p) {
        Welcome();

        int cash = 500;
        System.out.println("starting cash: $" + cash);
    
        cash = calculateMoney(quizQ1(), cash);
        cash = calculateMoney(quizQ2(), cash);
        cash = calculateMoney(quizQ3(), cash);
        cash = calculateMoney(quizQ4(), cash);
        cash = calculateMoney(quizQ5(), cash);
    
        System.out.println("Your winnings are: $" + cash);
        return;
    }
    
    // take string input
    //
    public static String takeInput(String message) {
        Scanner scanner = new Scanner(System.in);
        String answer;
    
        System.out.println(message);
        answer = scanner.nextLine();
    
        return answer;
    } 
    
    // presents the user a welcome message and provides them with the option to read the rules
    //
    public static void Welcome() {
    System.out.println("Welcome to the double or quit quiz!");

    String contestantname = takeInput("What is your name?");

    String rulesAccept = takeInput("Hello " + contestantname + "! Would you like me to explain the rules? (y/n)" );
    
    if ((rulesAccept.toLowerCase()).equals("y") | (rulesAccept.toLowerCase()).equals("yes")) {
        System.out.println("The rules are simple, take the quiz! \n for every question you get right I double your prize pool \n however for every question you get wrong I half it!");
        System.out.println("You start with $500 and there are X questions in total!");
    }
    else if ((rulesAccept.toLowerCase()).equals("n") | (rulesAccept.toLowerCase()).equals("no")) {
        System.out.println("Lets begin!");
    }
    else {
        System.out.println("Invalid response!");
    }
    System.out.println("Good Luck!");
    System.out.println("");
    } 
    
   
    
    //Quiz questions
    //
    public static boolean quizQ1() {
        Quiz question1 = new Quiz();
        question1.question = "What is the ?";
        question1.correctAnswer = "x";
        boolean correct = false;
    
        String answerQ1 = takeInput(question1.question);
        correct = correctOrIncorrect(answerQ1, question1.correctAnswer);
        
        return correct;
    }
    
    public static boolean quizQ2() {
        Quiz question2 = new Quiz();
        question2.question = "What is the 1?";
        question2.correctAnswer = "x";
        boolean correct = false;
    
        String answerQ2 = takeInput(question2.question);
        correct = correctOrIncorrect(answerQ2, question2.correctAnswer);
        
        return correct;
    }
    
    public static boolean quizQ3() {
        Quiz question3 = new Quiz();
        question3.question = "What is the 2?";
        question3.correctAnswer = "x";
        boolean correct = false;
        
        String answerQ3 = takeInput(question3.question);
        correct = correctOrIncorrect(answerQ3, question3.correctAnswer);
        
        return correct;
    }
    
    public static boolean quizQ4() {
        Quiz question4 = new Quiz();
        question4.question = "What is the 3?";
        question4.correctAnswer = "x";
        boolean correct = false;
        
        String answerQ4 = takeInput(question4.question);
        correct = correctOrIncorrect(answerQ4, question4.correctAnswer);
        
        return correct;
    }
    
    public static boolean quizQ5() {
        Quiz question5 = new Quiz();
        question5.question = "What is the 4?";
        question5.correctAnswer = "x";
        boolean correct = false;
        
        String answerQ5 = takeInput(question5.question);
        correct = correctOrIncorrect(answerQ5, question5.correctAnswer);

        return correct;
    }

    // determines the correctness of the answer to the quiz question
    //
    public static boolean correctOrIncorrect (String answered, String correctAns) {
        boolean correctS = false;
        
        if ((answered.toLowerCase()).equals(correctAns)) {
            System.out.println("");
            System.out.println("You answered: " + answered);
            System.out.println("Correct!");
            System.out.println("");
            correctS = true;
        }
        else {
            System.out.println("");
            System.out.println("You answered: " + answered);
            System.out.println("Incorrect!");
            System.out.println("");
        }
        return correctS;
    }
    
    // calculate the increase or decrease based on wether the question is right or wrong
    //
    public static int calculateMoney(boolean question, int money) {
        if (question == true) {
            money = pointInc(money);
            System.out.println(money);
        }
        else {
            money = pointDec(money);
            System.out.println(money);
        }
        return money;
    }
    
    // increase points
    //
    public static int pointInc(int pointPlus) {
        pointPlus = pointPlus*2;
        return pointPlus;
    }
    
    // decrease points
    //
    public static int pointDec(int pointMinus) {
        pointMinus = pointMinus/2;
        return pointMinus;
    }
} // END class name