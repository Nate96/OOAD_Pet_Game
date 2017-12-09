/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author braukhoffna
 */
public class Accommodation {
    private String instruction;
    private String name;
    
    public Accommodation(String i, String n)
    {
        this.instruction = i;
        this.name = n;
    }
    
    public String getName() {return name;}
    
    public String getInstuction() {return instruction;}
    
    public void setInstruction(String i) { instruction = i;}
    
    public void setName(String n) {
        name = n;}
    
}
