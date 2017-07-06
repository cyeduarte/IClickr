/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iclicker;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author BlackDragon92
 */
public class IClicker 
{

    
    public static void main(String[] args)
    {
        int questionType;
        int option;
        Scanner keyboard = new Scanner(System.in);
        Person person[] = new Person[10];
        VoteSystem iclick;
        
        do
        {
            System.out.println("Please enter one of the following options:/n"
                                + "1)To take the Quiz/n 0)To quit the quiz");
            option = keyboard.nextInt();
            
            if(option == 1)
            {
                test();
            }
            else if(option == 0)
            {
                System.out.println("You have decided to quit the program.");
            }
            else
            {
                System.out.println("You have selected an incorrect option.");
            }
        }while(option != 0);
        
    }
    
    public static void test()
    {
        
    }
    
    public static void setStudents()
    {
        
    }
    
    
    public static void setQuestionType()
    {
        char questionType;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Choose one of the following"
                                + " S)Single or M)Multiple choice");
        questionType = keyboard.next().charAt(0);
    }
    
    
    
}
