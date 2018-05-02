import java.util.ArrayList;

// NOTA BENE: javadoc comments removed for brevity
public class Generics {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        for ( int i = 0; i < al.size(); i += 1 ) {
            System.out.println("al.get(" + i + ") = " +
                               al.get(i));
        }

        System.out.println();

        // List.remove( Object ) returns true if removal succeeded
        if ( ! al.remove("Two") ) {
            System.out.println( "\"Two\" not removed" );
        }
        if ( ! al.remove("Six") ) {
            System.out.println( "\"Six\" not removed" );
        }

        // Another way to iterate through all of the elements.
        for ( String s : al ) {
            System.out.println(s);
        }

        System.out.println();

        for ( int i = 0; i < al.size(); i += 1 ) {
            // charAt and indexOf are methods of the String class.
            // Important that the ArrayList contains only String objects.
            System.out.println("al.get(" + i + ").charAt(1) = " +
                               al.get(i).charAt(1));
            System.out.println("al.get(" + i + ").indexOf('e') = " +
                               al.get(i).indexOf('e'));
        }
    }

}
