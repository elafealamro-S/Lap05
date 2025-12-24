/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap05;

import java.util.Scanner;
public class NewMain1 {

 
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        int div = 1;
        int sum = 0;
        
        do{
            if(num % div ==0)
                sum += div;
                div++;
            
        }while(div<num);
       
        if (sum == num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
        
    }
    
}
