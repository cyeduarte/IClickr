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
public class Multiple extends Question
{
    private String[] answerAry;
    private String voterAnswer;
    ArrayList<Multiple> questions = new ArrayList<>();
    
    public Multiple(String []answers, String voterAnswer){
         answerAry = new String[4];
         setVoterAnswer(voterAnswer);
         setAnswers(answers);
    }
    
    public Multiple(String question, char answer)
    {
        super(question, answer);        
    }
    
    public void setQuestions(String question)
    {
        
    }
    
    public void setAnswers(String[] answers)
    {
        for(int i = 0; i < answers.length; i++)
            answerAry[i] = answers[i];
    }
    
    public void setVoterAnswer(String voteAnswer)
    {
        this.voterAnswer = voterAnswer;
    }
    
    public boolean isCorrect()
    {
        for(int i = 0; i < answerAry.length; i++)
        {
            if(answerAry[i] == voterAnswer)
                return true;
        }
        
        return false;
    }
    
}
