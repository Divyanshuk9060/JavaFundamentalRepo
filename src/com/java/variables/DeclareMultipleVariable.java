package com.java.variables;

public class DeclareMultipleVariable {
    public static void main(String[] args) {
        //Declare Many Variables
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        //To declare more than one variable of the same type, you can use a comma-separated list:
        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        //Assign the same value to multiple variables in one line:
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);
    }
}
