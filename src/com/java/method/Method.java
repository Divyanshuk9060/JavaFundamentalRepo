package com.java.method;

public class Method {
    public static void main(String[] args) {
    int[] input={6,5,4,7,8,56};
    int[] input1={4,3,5,0};
        System.out.println("sum is : "+caluclateSum(input1));

    }

    private static int caluclateSum(int[] input) {
        int sum=0;
        for(int i: input){
            sum+=i;
        }
        return sum;
    }
}
