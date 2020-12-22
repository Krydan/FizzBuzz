package com.mycompany.fizzbuzz;

public class Fizzbuzz {
    
    public static void main(String[] args){
        fizzBuzz(100);
    }
    
    private static void fizzBuzz(int n){
        for(int i = 0; i <= n; i++){
            if(i%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}