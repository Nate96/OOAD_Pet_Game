/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.security.SecureRandom;


/**
 *
 * @author braukhoffna
 */
public abstract class Demographics {
    private int age; 
    private String name;
    private int uniqueID;
    
    private SecureRandom random = new SecureRandom();
    
    public Demographics(final int age, final String name)
    {
        this.age = age;
        this.name = name; 
        this.uniqueID = generateId();
    }
    
    int generateId()
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
}


