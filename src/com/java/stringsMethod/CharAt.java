package com.java.stringsMethod;

public class CharAt {
    public static void main(String[] args) {
        // *The charAt() method returns the character at the specified index (position):

        //Example 1
        String name = "Hello World";
        System.out.println("Character at 0 index is : " + name.charAt(0));      //Character at 0 index is : H
        System.out.println("Character at 4th index is : " + name.charAt(4));    //Character at 4th index is : o

        //Example 2
        String myStr = "Hello World";
        char FirstChar = myStr.charAt(0);
        char FifthChar = myStr.charAt(4);
        System.out.println("FirstChar is : " + FirstChar);  //FirstChar is : H
        System.out.println("FifthChar is : " + FifthChar);  //FifthChar is : o

        //Accessing First and Last Character by Using the charAt() Method
        String str = "Welcome to Hello World planet";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: "+ str.charAt(0)); //Character at 0 index is: W
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));    //Character at last index is: t

        //Print Characters Presented at Odd Positions by Using the charAt() Method
        String str1 = "Welcome to Hello World planet";
        for (int i=0; i<=str1.length()-1; i++) {
            if(i%2!=0) {
                System.out.println("Char at "+i+" place "+str1.charAt(i));
                //OUTPUT
                //Char at 1 place e
                //Char at 3 place c
                //Char at 5 place m
                //Char at 7 place
                //Char at 9 place o
                //Char at 11 place H
                //Char at 13 place l
                //Char at 15 place o
                //Char at 17 place W
                //Char at 19 place r
                //Char at 21 place d
                //Char at 23 place p
                //Char at 25 place a
                //Char at 27 place e
            }
        }



    }
}
