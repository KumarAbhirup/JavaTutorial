/*
 * GreedyChange.java
 *
 * Version:
 * $Id$
 *
 * Revisions:
 * $Log$
 */

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * GreedyChange program consumes denominations on the command line and
 * enters a loop servicing 'make change' requests until the user 
 * requests change for a non-positive value.
 * <P>
 * For example, after the program starts, the user enters 877 to change, 
 * then 'bad', and then 0 to quit. The '$' is the terminal prompt.
 * <P>
 * Example Session:
 * <PRE>
 * $ java GreedyChange 5 100 25 10 1 50
 * Change denominations are: 100 50 25 10 5 1
 * Make change for: 877
 * Your change:
 * 8 coin/s of value 100 each.
 * 1 coin/s of value 50 each.
 * 1 coin/s of value 25 each.
 * 2 coin/s of value 1 each.
 * Change denominations are: 100 50 25 10 5 1
 * Make change for: bad
 * Sorry, "bad" is not an integer. Try again.
 * Change denominations are: 100 50 25 10 5 1
 * Make change for: 0
 * $
 * </PRE>
 * @author bks: ben k steele 
 */
public class GreedyChange {

    /**
     * makeChange returns the list of counts for each denomination that
     * produce the correct change for the amount.
     * If making change is impossibe, makeChange returns null.
     * <P>
     * makeChange : int ListOfInteger -> ListOfInteger | Null
     * pre-conditions : ListOfInteger must be descending-sorted
     *
     * @param amount the value for which to make change
     * @param denominations the available denominations to use in making change
     * @return list of coin counts in an ArrayList<Integer> 
     */
    static ArrayList<Integer> makeChange( int amount, 
                                          ArrayList<Integer> denominations ) {

        ArrayList<Integer> change = new ArrayList<Integer>();
        int residual = amount;
        for ( Integer denom : denominations ) {
            int coins = residual / denom;
            residual -= coins * denom;
            change.add( coins );
        }
        if ( residual > 0 ) {
            change = null;
        }
        return change;
    }

    /**
     * GreedyChange starts with a fixed set of denominations
     * and continues to prompt the user for a value to denominate using
     * the denominations until the user enters a '0' value to tell the
     * the program to quit.
     * <P>
     * main : ArrayOfString -> Void
     * pre-conditions : ArrayOfString must be non-empty
     *
     * @param args   args[0] args[1] ... denominations available for change
     */
    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
       
        ArrayList<Integer> denominations = new ArrayList<Integer>();

        // check argument count and give usage message if incorrect.

        if ( args.length < 1 ) {
            System.out.println( "Usage: \"" 
                              + "java GreedyChange denom1 [denom2...]\"" );
            return;
        }

        // convert inputs to list of integers, sort and then reverse list

        for ( int j = 0 ; j < args.length ; j++ ) {

            int val = Integer.parseInt( args[j] );  // convert String to int
            if ( val < 1 ) {
                System.out.println( "Ignoring value, \"" 
                                   + val 
                                   + "\"; not a positive integer." );
            } else {
                denominations.add( val );
            }
        }

        Collections.sort( denominations );
        Collections.reverse( denominations );

        // start the loop providing the 'make change' service

        int amount = 0;
        do {
            // print the list of denominations

            System.out.print( "Change denominations are:" );
            for ( Integer denom: denominations ) {
                System.out.print( " " + denom );
            }
            System.out.println();

            // prompt for the amount to change

            System.out.print( "Make change for: " );
            if ( ! sc.hasNextInt() ) {

                // amount the user entered is invalid

                String s = sc.next();
                System.out.println( "Sorry, \"" + s 
                                   + "\" is not an integer. Try again." );
                amount = 1;
                continue;

            } else {
                // convert amount the user entered, and make change

                amount = sc.nextInt();

                ArrayList<Integer> change = makeChange( amount, denominations );

                if ( change == null ) {
                    System.out.println( "Can't make correct change for "
                                       + amount + "!" );

                } else if ( change.size() == 0 || amount < 1 ) {
                    break;

                } else {
                    System.out.println( "Your change:" );
                    for ( int i = 0 ; i < denominations.size() ; i++ ) {
                        int denom = denominations.get( i );
                        int coins = change.get( i );
                        if ( coins > 0 ) {
                            System.out.println( coins 
                                               + " coin/s of value " 
                                               + denom + " each." );
                        }
                    }
                }
            }
        } while ( amount > 0 );
    }

} // class GreedyChange

