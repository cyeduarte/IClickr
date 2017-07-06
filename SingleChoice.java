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
public class SingleChoice extends Question
{
    private ArrayList<String> choice = new ArrayList<>();
    
    public SingleChoice(String question, char answer)
    {
        super(question, answer);
    }
    
    public void setQuestion(String question)
    {
        choice.add(question);
    }
    
}
