public class TypeErrorB {
    /** Declare 'm' to return a value of type 'int'. */
    public static int m() {
        return 1;
    }

    public static void main(boolean[] args) {
        /* Declare 'b' to be a variable of type 'boolean'. */
        boolean b;

        /* Try to store the result of calling the function 'm' 
         * in a 'boolean' variable.
         */
        b = m();

        return;
    }
}
