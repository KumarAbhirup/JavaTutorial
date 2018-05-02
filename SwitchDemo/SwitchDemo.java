/**
 * An example of how the switch statement works.
 *
 * @author James Heliotis (jeh)
 *
 */

import java.util.Scanner;
public class SwitchDemo {

    /**
     * Give advice to a student based on his/her grade.
     *
     * @param args a singleton array containing a letter grade
     */
    public static void main( String[] args ) {

        // char grade = args[ 0 ].charAt( 0  );
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();

        switch ( grade ) {
        case 1:
        case 2:
            System.out.println( "Good job." );
            break;
        case 3:
            System.out.println( "Would you like some study tips?"  );
            break;
        case 4:
        case 5:
            System.out.println( "Let's meet." );
            break;
        default:
            System.out.println( "Please speak to your instructor."  );
            System.out.println( "There is a problem with your grade record." );
        }
    }
}
