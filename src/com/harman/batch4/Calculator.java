package com.harman.batch4;
import java.util.Scanner;

public class Calculator extends ParentCalculator{

    public static void main(String[] args) {


        //Classname objname=new Classname();

        Calculator calc=new Calculator();
        Scanner input=new Scanner(System.in);
        int n1,n2,result1, result2,result3,result4;
        System.out.println("Enter N1: ");
        n1 = input.nextInt();
        System.out.println("Enter N2: ");
        n2 = input.nextInt();
        result1 = calc.Addition(n1,n2);
        result2 = calc.Substraction(n1,n2);
        result3 = calc.Multiply(n1,n2);
        result4 = calc.Divide(n1,n2);

        System.out.println("Addition is: " +result1);
        System.out.println("Substraction is: " +result2);
        System.out.println("Multiplication is: " +result3);
        System.out.println("Division is: " +result4);

    }
}
