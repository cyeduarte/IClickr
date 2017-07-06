/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iclicker;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author BlackDragon92
 */
public class VoteSystem 
{
    private static int count = 0;
    private String message;
    private char[] countAnswers; //represents A, B, C, D
    private static int correctCount, incorrectCount;
    private ArrayList<Question> questionList = new ArrayList<>();
    private ArrayList<Person> studentList = new ArrayList<>();
    char[] multipleChoice;
    
    public VoteSystem(String message)
    {
        this.message = message;
    }
    
    public void VoteSystem(String id, char answer)
    {
        countAnswers = new char[4];
        correctCount = 0;
        incorrectCount = 0;
        Person student = new Person(id, answer);
        studentList.add(student);
       
    }
    
    public void setQuestions()
    {
        Scanner keyboard = new Scanner(System.in);
        int numQuestions;
        String newQuestion;
        char answer;
        Question question;
        
        System.out.println("How many question do you want to have?");
        numQuestions = keyboard.nextInt();
        
        for(int i = 0; i < numQuestions; i++)
        {
            System.out.println("Question " + i);
            newQuestion = keyboard.nextLine();
            
            System.out.println("Answer to Question " + i );
            answer = keyboard.next().charAt(0);
            
            question = new Question(newQuestion, answer);
            questionList.add(question);
        }
    }
    
    public void countQuestions(char answer)
    {
        if(answer == 'A' || answer == 'a')
        {
            countAnswers[0] += 1;
        }
        else if(answer == 'B' || answer == 'b')
        {
            countAnswers[1] += 1;
        }
        else if(answer == 'C' || answer == 'c')
        {
            countAnswers[2] += 1;
        }
        else if(answer == 'D' || answer == 'd')
        {
            countAnswers[3] += 1;
        }
    }
    
    public void countCorrect(char answer, int order)
    {
        if(questionList.get(order).isCorrect(answer) == true)
            correctCount++;
        else
            incorrectCount++;
    }
    
    public void stats()
    {
        System.out.println("The number of A's is " + countAnswers[0] +
                           "\nThe number of B's is " + countAnswers[1] +
                           "\nThe number of C's is " + countAnswers[2] +
                           "\nThe number of D's is " + countAnswers[3] +
                           "\nThe number of correct answers is " + correctCount +
                           "\nThe number of incorrect answers is " + incorrectCount);
    }
}
