package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Progression prog;
        /*
        * Testing the Arithmetic progression
        * */
        System.out.println("Testing out the Arithmetic Progression");
        prog = new ArithmeticProgression();
        prog.printProgression(10);
        System.out.print("Arithmetic progression with increment 5: ");
        prog = new ArithmeticProgression(5);
        prog.printProgression(10);
        System.out.print("Arithmetic progression with start 2: ");
        prog = new ArithmeticProgression(5, 2);
        prog.printProgression(10);

        // test GeometricProgression
        System.out.print("Geometric progression with default base: ");
        prog = new GeometricProgression( );
        prog.printProgression(10);
        System.out.print("Geometric progression with base 3: ");
        prog = new GeometricProgression(3);
        prog.printProgression(10);


        // test FibonacciProgression
        System.out.print("Fibonacci progression with default start values: ");
        prog = new FibonacciProgression( );
        prog.printProgression(10);
        System.out.print("Fibonacci progression with start values 4 and 6: ");
        prog = new FibonacciProgression(4, 6);
        prog.printProgression(8);
    }
}
