/**
 * The Calculator class performs arithmetic operations on two numbers and displays the results.
 */

/**
 * The Calculator class performs arithmetic operations on two numbers and displays the results.
 */
public class Calculator {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        // Perform arithmetic operations
        int sumResult = add(a, b);
        int differenceResult = subtract(a, b);
        int productResult = multiply(a, b);
        int quotientResult = divide(a, b);

        // Display results
        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Product: " + productResult);
        System.out.println("Quotient: " + quotientResult);

    
    }

    // Function for addition
    /**
     * The function "add" takes two integers as input and returns their sum.
     * 
     * @param a The parameter "a" is an integer value.
     * @param b The parameter "b" is an integer that represents the second number to be added.
     * @return The sum of the two input integers, `a` and `b`, is being returned.
     */
    // The code block you provided defines four functions: `add`, `subtract`, `multiply`, and `divide`.
    public static int add(int a, int b) {
        return a + b;
    }

    // Function for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function for multiplication
    public static int multiply(int a, int b) {
        return a *b;
    }

    // Function for division
    public static int divide(int a, int b) {
        return a / b;
    }
}
