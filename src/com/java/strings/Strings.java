package com.java.strings;

public class Strings {
    public static void main(String[] args) {
        //Strings are used for storing text.
        //A String variable contains a collection of characters surrounded by double quotes:

        //Create a variable of type String and assign it a value:
        String greeting = "Hello World";
        System.out.println("Greeting : " + greeting);
        //Output : Greeting : Hello World

        //There are many string methods available for Example:
        // *String length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is : " + txt.length()); //Output 26

        // *toUpperCase() and toLowerCase() method:
        String txt1 = "Hello World";
        System.out.println("To print UpperCase in string : " + txt1.toUpperCase());
        //Output : To print UpperCase in string : HELLO WORLD
        System.out.println("To print LowerCase in string : " +txt1.toLowerCase());
        //Output : To print LowerCase in string : hello world

        // *The charAt() method returns the character at the specified index (position):
        String name = "Hello, World";
        System.out.println("Char at place of '0': " + name.charAt(0));
        //Output : Char at place of '0': H
        System.out.println("Char at place of '7': " +name.charAt(7));
        //Output : Char at place of '7': W

        // *The indexOf() method returns the index (the position) of the first occurrence of a specified character/substring within the string (including whitespace):
        //There are 4 indexOf() methods:
        //1.public int indexOf(String str)
        //2.public int indexOf(String str, int fromIndex)
        //3.public int indexOf(int char)
        //4.public int indexOf(int char, int fromIndex)

        //1.public int indexOf(String str)
        //The substring you want to search for within the string.
        String sentence = "The colorful flowers in the garden added beauty and charm to the backyard.";
        System.out.println("Index of string 'the' : " + sentence.indexOf("the"));
        //Output : Index of string 'the' : 24
        int indexOfColorful = sentence.indexOf("colorful");
        System.out.println("Index of string 'colorful' : " + indexOfColorful);
        //Output : Index of string 'colorful' :4


        //2.indexOf(String str, int fromIndex)
        //Note : str – the substring to search for. fromIndex – the index from which to start the search.
        String sentence1 = "The colorful flowers in the garden added beauty and charm to the backyard.";
        System.out.println("Index of str 'the' starting from index 25 : " + sentence1.indexOf("the",25));
        //Output : Index of str 'the' starting from index 25 : 61


        //3.public int indexOf(int char)
        String sentence2 = "The colorful flowers in the garden added beauty and charm to the backyard.";
        System.out.println("Index of Char 'o' : " + sentence2.indexOf('o'));
        //Output : Index of Char 'o' : 5

        //4.public int indexOf(int char, int fromIndex)
        String sentence3 = "The colorful flowers in the garden added beauty and charm to the backyard.";
        System.out.println("Index of char 'o' starting from index 6 : " + sentence3.indexOf('o',6));
        //Output : Index of char 'o' starting from index 6 : 7
















    }
}
