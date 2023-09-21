package com.java.typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening casting is done automatically when passing a smaller size type to a larger size type:
        int Int = 9;
        double Double = Int; // Automatic casting: int to double

        System.out.println(Int);      // Outputs 9
        System.out.println(Double);   // Outputs 9.0

        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
