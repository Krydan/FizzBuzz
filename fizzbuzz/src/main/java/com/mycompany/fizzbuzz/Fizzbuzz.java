package com.mycompany.fizzbuzz;

public class Fizzbuzz {
    
    public static void main(String[] args){
        fizzBuzz(100, 3, 5);
    }
    
    private static void fizzBuzz(int n, int fizz, int buzz){
        for(int i = 1; i <= n; i++){
            if(i%(fizz*buzz) == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%fizz == 0){
                System.out.println("Fizz");
            }
            else if(i%buzz == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}