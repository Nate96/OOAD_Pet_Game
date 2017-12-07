/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myversion;

/**
 *
 * @author braukhoffna
 */
public class MyVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Pet p1 = new Pet(1, 1, 1, "Greg"); 
        System.out.println(p1.getID()); 
        
        Pet p2 = new Pet(2, 2, 2, "snowball");
        System.out.println(p2.getID());
        
        Customer c1 = new Customer(21, "Rick");
        System.out.println("");
        c1.addPet(p2);
        c1.addPet(p1);
        Pet p3 = new Pet(1, 1, 1, "Jery");
        Pet p4 = new Pet(1, 1, 1, "Morty");
        Pet p5 = new Pet(1, 1, 1, "Summer");
        Pet p6 = new Pet(1, 1, 1, "BridPerson");
        c1.addPet(p5);
        c1.addPet(p4);
        c1.addPet(p3);
        c1.addPet(p6);
        
 
        for (int i = 0; i < c1.getNumerOfPets(); i++)
            System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
        System.out.println(c1.getNumerOfPets()); 
        
       System.out.println(" ");  
       c1.remove("Nate");
       for (int i = 0; i < c1.getNumerOfPets(); i++)
       System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
       System.out.println(c1.getNumerOfPets());
           
        System.out.println(" ");  
        c1.remove("snowball");
        for (int i = 0; i < c1.getNumerOfPets(); i++)
            System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
        System.out.println(c1.getNumerOfPets()); 
       
        System.out.println(" ");
        c1.remove("Greg");
        for (int i = 0; i < c1.getNumerOfPets(); i++)
            System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
        System.out.println(c1.getNumerOfPets()); 
        
        System.out.println(" ");
        c1.remove("Morty");
        for (int i = 0; i < c1.getNumerOfPets(); i++)
            System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
        System.out.println(c1.getNumerOfPets());
        
        System.out.println(" ");
        c1.remove("Summer");
        for (int i = 0; i < c1.getNumerOfPets(); i++)
            System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
        System.out.println(c1.getNumerOfPets());
        
        System.out.println(" ");
        c1.remove("Greg");
        for (int i = 0; i < c1.getNumerOfPets(); i++)
            System.out.println(c1.getpetlist()[i].getID() + " " + c1.getpetlist()[i].getName());
       System.out.println(c1.getNumerOfPets());
        
        
    }
    
}
