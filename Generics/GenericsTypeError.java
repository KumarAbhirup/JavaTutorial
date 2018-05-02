import java.util.ArrayList;

public class GenericsTypeError {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        // Trying to add an 'int' to an 'ArrayList<String>'.
        al.add(5);
        for ( int i = 0; i < al.size(); i += 1 ) {
            System.out.println("al.get(" + i + ") = " +
                               al.get(i));
        }

        System.out.println();

        al.remove("Two");
        al.remove("Six");  // Removing a not-found element silently succeeds.
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
            // add is not a method of the String class.
            System.out.println("al.get(" + i + ").add(\"Nine\") = " +
                               al.get(i).add("Nine"));
        }
    }

}