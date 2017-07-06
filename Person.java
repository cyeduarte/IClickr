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
public class Person 
{
    private String name;
    private String id;
    private char answer;
    
    public Person()
    {
        this.name = "not named";
        this.id = "-----------";
    }
    
    public Person(String id, char answer)
    {
        setID(id);
        setAnswer(answer);
    }
    
    public Person(String name, String id, char answer)
    {
        setName(name);
        setID(id);
        setAnswer(answer);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setID(String id)
    {
        this.id = id;
    }
    
    public void setAnswer(char answer)
    {
        this.answer = answer;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getID(String id)
    {
        return id;
    }
    
    public char getAnswer()
    {
        return answer;
    }
}
