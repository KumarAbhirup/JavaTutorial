public class TypeErrorC {
    /** Declare 'm' to return a value of type 'boolean'. */
    public static boolean m() {
        return 1;
    }

    public static void main(String[] args) {
        /* Declare 'b' to be a variable of type 'boolean'. */
        boolean b;

        /* Try to store the result of calling the function 'm' 
         * in a 'boolean' variable.
         */
        b = m();

        return;
    }
}
