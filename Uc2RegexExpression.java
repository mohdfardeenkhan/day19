package com.bridgelabz;
import java.util.Scanner;

public class Uc2RegexExpression
{
    public boolean firstName(String name)
    {
        String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
        if (name.matches(firstName))
        {
            return true;
        }
        return false;
    }
    public boolean lastName(String name)
    {
        String lastName = "^[A-Z]{1}[A-Za-z]{2,}$";
        if (name.matches(lastName))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Uc2RegexExpression regex = new Uc2RegexExpression();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name :");
        String firstName = scan.nextLine();
        System.out.println(regex.firstName(firstName));

        System.out.println("Enter the last name :");
        String lastName = scan.nextLine();
        System.out.println(regex.firstName(lastName));
    }
}