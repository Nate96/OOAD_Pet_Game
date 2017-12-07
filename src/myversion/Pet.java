package myversion;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author braukhoffna
 */
public class Pet extends basicInformation{
    private int hight; 
    private int weight; 
    private final int MAX = 10;
    private float foodAmount; 
    private basicInformation info; 
    private SpecailNeeds[] needList;
    private Prescription[] pList; 
    private int needNum;
    private int pNum; 
 
    

    public Pet(int age, int hight, int weight, String name)
    {
        super(age, name);
        info = new basicInformation(age, name);
        hight = this.hight;
        weight = this.weight; 
    }
    
    public int getHight() {return hight;}
    
    public void setHight(int h) {hight = h;} 
    
    public void addN(SpecailNeeds n)
    {
        if (needNum < MAX)
            needList[needNum++] = n;
    }
    
    public void addP(Prescription p)
    {
        if (pNum < MAX)
            pList[pNum++] = p;
    }
    
    public void removeN(String n)
    {
        for (int i = 0; i < needNum; i++ )
        {
            if (n == needList[i].getNeed())
            {
                for (int j = i; j < needNum - 1; j++)
                    needList[j] = needList[j + 1];
                needNum--;
            }
        }
    }
    
    public void removeP(String n)
    {
        for (int i = 0; i < pNum; i++ )
        {
            if (n == pList[i].getName())
            {
                for (int j = i; j < pNum - 1; j++)
                    pList[j] = pList[j + 1];
                pNum--;
            }
        }
    }
    
}
