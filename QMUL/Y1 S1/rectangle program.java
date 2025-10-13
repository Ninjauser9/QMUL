// Rectangle record
//
import java.util.Scanner;

class Rectangle
{
    String name;
    int width;
    int length;
    int area;
}

// store rectangle details and print them
//
class rectangledimensions
{
    public static void main(String[]p)
    {
        rectdims();
        return;
    }

    //create example rectangle dimensions
    //
    public static void rectdims()
    {
        Rectangle A = createRectangle("A");

        printRectangleDims(A);
        return;
    }

    //print all known rectangles
    //
    public static void printRectangleDims(Rectangle next)
    {
        System.out.println("rectangle: "+ next.name);
        System.out.println("width: " + next.width);
        System.out.println("length: "+ next.length);
        System.out.println("area: "+ next.area);
        System.out.println("");
        return;
    }

    //create a rectangle record and set the fields to their values
    //
    public static Rectangle createRectangle(String given_name)
    {
        Rectangle next = new Rectangle();

        next.name = given_name;
        next.width = inputW();
        next.length = inputL();
        next.area = next.width * next.length;

        return next;
    }
    public static int inputW()
    {
        Scanner scanner = new Scanner(System.in);
        int w;
    
        System.out.println("Enter the width of your rectangle in cm: ");
        w = Integer.parseInt(scanner.nextLine());
        return w;
    }

    public static int inputL()
    {
        Scanner scanner = new Scanner(System.in);
        int l;
    
        System.out.println("Enter the length of your rectangle in cm: ");
        l = Integer.parseInt(scanner.nextLine());
        return l;
    }
}