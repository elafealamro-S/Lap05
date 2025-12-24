/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap05;
import java.util.Scanner;
public class NewMain {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a : ");
        int a = in.nextInt();
        
        System.out.print("Enter b : ");
        int b = in.nextInt();
        
        int sum = 0;
        for (int i = a ; i <= b ; i++){
            sum +=i ;
        }
        
        System.out.println("The sum is " + sum);
}
}
