// Brandon CL
// 16/10/25
// Version 1
// A program to calculate the bill at a restaurant and splits the bill cost per diner

import java.util.Scanner;

class Restaurantbill {
    public static void main(String [] param) {
        final double SERVICE_CHARGE_MULTIPLIER = 1.125;
        int num_diners = takeNum("how many diners: ");
        int subtot_pounds = takeNum("subtotal in pounds?: ");
        int subtot_pence = takeNum("subtotal in pence?: ");

        double total = convTot(subtot_pounds, subtot_pence);
        System.out.println("total: $"+ total);
        double totAndSer = total * SERVICE_CHARGE_MULTIPLIER;
        System.out.println("total + service charge: $"+ totAndSer);

        splitBill(num_diners, totAndSer);
        
        return;
    }
    
    public static int takeNum(String message) {
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        return answer;
    }

    public static double convTot(int pound, int pence) {
        pound = pound * 100;
        int total = pound + pence;

        double dTotal = total;
        System.out.println(dTotal);
        double newTotal = dTotal/100;
        System.out.println(newTotal);
        return newTotal;
    } 

    public static void splitBill(int diners, double totSplit) {
        for (int i=diners; i>= 1; i--) {
            int deduct = takeNum("How much is diner "+ i +"paying?");
            System.out.println(i + " is paying: " + deduct);
            double deductFloat = deduct;
            totSplit = totSplit - deductFloat;
        } 
        System.out.println("Left to pay: "+ totSplit);
        return;
    }
}
