public class TypeErrorD {
    /** Declare 'm' to take a value of type 'int'
     * and to return a value of type 'boolean'.
     */
    public static boolean m(int i) {
        return i > 0;
    }

    public static void main(String[] args) {
        /* Declare 'b' to be a variable of type 'boolean'. */
        boolean b;

        /* Try to store the result of calling the function 'm' 
         * with an argument of type 'boolean'
         * in a 'boolean' variable.
         */
        b = m(true);

        return;
    }
}
