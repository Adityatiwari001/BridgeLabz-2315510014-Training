package FullStack;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        
        String[] results = new String[n + 1];

       
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                results[i] = "0"; 
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "fizzbuzz";
            } else if (i % 3 == 0) {
                results[i] = "fizz";
            } else if (i % 5 == 0) {
                results[i] = "buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

     
        for (int i = 1; i <= n; i++) {
            System.out.println("position" + i + "=" + results[i]);
        }

        
    }
}
