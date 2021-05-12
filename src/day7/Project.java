package day7;

public class Project {
    public static void main (String[] args) { 
       // int amount = Integer.parseInt(args[0]);
       int amount = 99;

       int rest = amount;
       int quarters = rest / 25;
       rest = rest % 25; 
       
       int dimes = rest / 10;
       rest = rest % 10;
       
       int nickels = rest / 5;
       rest = rest % 5;
       
       int pennies = rest;
           
       System.out.println(amount + " cents in coins:");
       System.out.println(quarters + " quarters");
       System.out.println(dimes + " dimes");
       System.out.println(nickels + " nickels");
       System.out.println(pennies + " pennies");
    }
}
