package myversion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author braukhoffna
 */
public class SpecailNeeds {
    private String instruction; 
    private String need; 
    
    public SpecailNeeds(String i, String n)
    {
        this.instruction = i; 
        this.need = n;
    }
    
    public String getNeed() {return need;}
    
    public String getInstuction() {return instruction;}
    
    public void setInstruction(String i) { instruction = i;}
    
    public void setNeed(String n) {need = n;}
    
}
