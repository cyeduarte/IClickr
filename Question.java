/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iclicker;

import java.util.ArrayList;
/**
 *
 * @author BlackDragon92
 */
public class Question 
{
    private char correctAnswer;
    private char voteAnswer;
    private char type;
    private String question;
    private static int order = 0;

    
    public Question(){
        //empty constructor
    }
    
    public Question(String question, char answer)
    {
        setQuestion(question);
        setAnswer(answer);
    }
    
    public void setQuestion(String question)
    {
        this.question = question;
    }
    
    public void setAnswer(char answer)
    {
        correctAnswer = answer;
    }
    
    public void setVoteAnswer(char voteAnswer)
    {
        
        this.voteAnswer = voteAnswer;
    }
    
    public void setQuestionType(char type)
    {
        if(type == 'S' || type == 's' || type == 'M' || type == 'm')
            this.type = type;
        else
            System.out.println("You have chosen an unspecified type."
                                + " There are only two types Single or Multiple"
                                + " choice.");
    }
    
    public void nextQuestion()
    {
        order++;
    }
  
    public void showQuestion()
    {
        System.out.println(question);
    }
    
    public void showAnswer()
    {
        System.out.println(correctAnswer);
    }
    
    public String getString(){
        return question;
    }
    
    public char getAnswer(){
        return correctAnswer;
    }
    
    public boolean isCorrect(char answer)
    {
        return this.correctAnswer == answer;
    }
    
    public String toString(char answer)
    {
        if(isCorrect(answer) == true)
        {
            return "The answer is correct";
        }
        
        return "The answer is incorrect";
    }
}
