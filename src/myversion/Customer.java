/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author braukhoffna
 */
public class Customer extends Demographics {

    private Map<Integer, Pet> pets = new LinkedHashMap<>();
    private Map<String, Integer> nameIdMap = new HashMap<>();

    public Customer(final int age, final String name)
    {
        super(age, name);
    }

    public void addPet(final Pet pet)
    {
        pets.put(pet.getIDValue(), pet);
    }

    public void remove(final String name)
    {
        final Integer petId = nameIdMap.get(name);
        pets.remove(petId);
        nameIdMap.remove(name);
    }


    public int getNumberOfPets() {return pets.size();}

    public boolean isEmpty () {return pets.isEmpty();}

    public Map getPets(){return pets;}
}
