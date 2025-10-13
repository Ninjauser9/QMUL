/* 
public static void name()
{
    int age;
    int score1;
    int score2;
    final float fitMultiplier = 1.6;

} 
*/

public static String inputString (String message)
{
       String answer;
       Scanner scanner = new Scanner(System.in);

       System.out.println(message);
       answer = scanner.nextLine();
   
       return answer;
}

// Ask three different questions
//
public static void askThreeQuestions ()
{
    String film_answer;
    String rating_answer;
    String actor_answer;
    
    // DECLARE ALL THE VARIABLES NEEDED HERE FIRST
    
    film_answer = inputString("Which dream-themed film did Christopher Nolan direct?");
    System.out.println("So you think the film was " + film_answer + " do you?");
    System.out.println("");
       
    // ADD THE OTHER TWO QUESTIONS ECHOING ANSWERS HERE

    //Q2
    //
    rating_answer = inputString("What would you rate it out of 5?");
    System.out.println("So you think the film was a " + rating_answer + "/5 do you?");
    System.out.println("");
    
    //Q3
    //
    actor_answer = inputString("Who was your favourite actor?");
    System.out.println("I liked " + actor_answer + "'s performance too!");
    System.out.println("");

    return;
} // END askThreeQuestions

askThreeQuestions();
    