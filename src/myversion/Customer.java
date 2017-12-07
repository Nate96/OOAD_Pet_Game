/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myversion;

import java.lang.reflect.Array;

/**
 *
 * @author braukhoffna
 */
public class Customer extends basicInformation{
    
    private final int MAX = 10;
    private Pet[] listOfPets;
    private int numberOfPets;
    
    public Customer(int a, String n) 
    {
        super(a, n);
        listOfPets = new Pet[MAX];
        numberOfPets = 0; 
    }

    public void addPet(Pet p)
    {
        if (!isFull())
        {
            listOfPets[numberOfPets++] = p;
            sort();
        }  
    }
    
    public void sort()
    {
        for (int i = 1; i < numberOfPets; i++)
        {
            Pet index = listOfPets[i]; int j = i;
            while (j > 0 && listOfPets[j-1].getIDValue() > index.getIDValue())
            {
                listOfPets[j] = listOfPets[j-1];
                j--;
            }
            listOfPets[j] = index;
        }
            
    }
    
    public void remove(String n)
    {
        for (int i = 0; i < numberOfPets; i++ )
        {
            if (n == listOfPets[i].getName())
            {
                for (int j = i; j < numberOfPets - 1; j++)
                    listOfPets[j] = listOfPets[j + 1];
                numberOfPets--;
            }
        }
    }
    public Pet[] getpetlist(){ return listOfPets; }
    
    public int getNumerOfPets() {return numberOfPets;}
    
    public boolean isEmpty () {return numberOfPets == 0;}
    
    public boolean isFull() {return numberOfPets == MAX;}
    
}
