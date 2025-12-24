/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap05;

import java.util.Scanner;
public class NewMain2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter string 1: ");
        String a = in.nextLine();
        
        System.out.print("Enter string 2: ");
        String b = in.nextLine();
        
        int x = 0;
        String ans = "";
        while (a.charAt(x) == b.charAt(x)){
            ans += a.charAt(x);
            x++;  
            }
        System.out.println("Longest common prefix is: " + ans);
    
}
}
