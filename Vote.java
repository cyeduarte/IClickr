/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iclicker;

/**
 *
 * @author BlackDragon92
 */
public interface Vote 
{
    public void vote(String id, char answer);
    public void stats(char choice);
    public void setQuestions();
    
}
