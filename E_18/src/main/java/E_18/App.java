package E_18;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        float temp;
        String conversion;


        System.out.print("Enter F to convert to Fahrenheit or C to convert to Celsius: ");
        conversion = reader.next();
        System.out.println("You chose: " + conversion);
        if(conversion.compareTo("C") == 0 || conversion.compareTo("c") == 0){
            conversion = "Celsius";
            System.out.print("Please Enter the temperature in Fahrenheit: ");
            temp = reader.nextFloat();
            temp = (temp-32)*5/9;

        }else{
            conversion = "Fahrenheit";
            System.out.print("Please Enter the temperature in Celsius: ");
            temp = reader.nextFloat();
            temp =  (temp*9/5)+32;
        }

        System.out.printf("Your Temperature in %s is %.0f Degrees",conversion,temp);
    }
}
