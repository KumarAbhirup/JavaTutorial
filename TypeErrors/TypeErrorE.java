public class TypeErrorE {
    /** Declare 'm' to take values of type 'int' and 'String'
     * and to return a value of type 'int'.
     */
    public static int m(int i, boolean b) { 
        return i - b;
    }

    public static void main(String[] args) {
        /* Declare 'j' to be a variable of type 'int'. */
        int j;

        /* Try to store the result of calling the function 'm' 
         * with arguments of type 'int' and 'String'
         * in an 'int' variable.
         */
        j = m(1, true);

        return;
    }
}
