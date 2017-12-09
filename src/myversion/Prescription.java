/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author braukhoffna
 */
public class Prescription {
    private float dose; 
    private String name; 
    private String frequency; 
    
    public Prescription(float dose, String name, String frequency)
    {
        this.dose = dose;
        this.name = name;
        this.frequency = frequency;
    }
    
    public float getDose(){return dose;}
    
    public String getName() {return name;}
    
    public String getFrequency() {return frequency;}
    
    public void setDose(float d) {dose = d;}
    
    public void setName(String n) {name = n;}
    
    public void setFrequency (String f) {frequency = f;}
}
