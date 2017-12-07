/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myversion;
import java.security.SecureRandom;


/**
 *
 * @author braukhoffna
 */
public class basicInformation {
    private int age; 
    private String name;
    private int uniqueID;
    
    SecureRandom random = new SecureRandom(); 
    
    public basicInformation(int age, String name)
    {
        this.age = age;
        this.name = name; 
        this.uniqueID = generateId();
    }
    
    public int generateId()
    {
       return random.nextInt(10000);

    }
    
    public String getID()
    { 
        int num = uniqueID;
        String formatted = String.format("%05d", num);
        return formatted;
    }
    
    public int getAge(){return age;}
    public void setAge(int a) {age = a;}
    public String getName() {return name;}
    public void setName(String n) {name = n;}
    public int getIDValue() {return uniqueID;}
//    
}


