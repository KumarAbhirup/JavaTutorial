import java.util.Scanner;
public class PromptDoWhile {

    public static void main( String[] args ) {
        double x = -1.0;
        Scanner input = new Scanner( System.in );
        do {
            System.out.print( "Enter a positive number: " );
            if ( input.hasNextDouble() ) {
                x = input.nextDouble();
            } else {
                input.next(); // Consume the non-double input
            }
        } while ( x < 0.0 );
        System.out.println( "The square root of " + x
                          + " is " + Math.sqrt( x ) + "." );
    }
}
