package com.java.variables;

public class Variables {
    public static void main(String[] args) {
        String name = "Divyanshu";
        System.out.println(name);

        //Variable assign it the value 15:
        int myNum = 10;
        System.out.println(myNum);

        //Variable without assigning the value
        int myNum1;
        myNum1 = 24;
        System.out.println(myNum1);

        //Assign a new value to an existing variable
        int myNum2 = 50;
        myNum2 = 60;  // myNum is now 60
        System.out.println(myNum2);

        //Declare variables of other types:
        int Num = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(Num);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //Print all variable in single line
        System.out.println( "Num : "+Num  + " myFloatNum : " + myFloatNum + " myLetter : " + myLetter + " myBool : " + myBool + " myText : " + myText);

        //Print all variable in multiple line without "System.out.println"
        System.out.println( "Num : "+Num +'\n' + "myFloatNum : " + myFloatNum +'\n'+ "myLetter : " + myLetter +'\n'+ "myBool : " + myBool +'\n'+ "myText : " + myText);



    }
}
