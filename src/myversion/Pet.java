/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author braukhoffna
 */
public class Pet extends Demographics {
    private int height;
    private int weight;
    private float foodAmount;
    private Map<String, Accommodation> accommodations = new HashMap<>();
    private Map<String, Prescription> prescriptions = new HashMap<>();

    public Pet(int age, int height, int weight, String name) {
        super(age, name);
        this.height = height;
        this.weight = weight;
    }

    public void addAccommodation(final Accommodation accommodation) {
        accommodations.put(accommodation.getName(), accommodation);
    }

    public void addPrescription(final Prescription prescription) {
        prescriptions.put(prescription.getName(), prescription);
    }

    public void removeAccommodation(final String name) {
        accommodations.remove(name);
    }

    public void removePrescription(final String name) {
        prescriptions.remove(name);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(float foodAmount) {
        this.foodAmount = foodAmount;
    }

    public Map<String, Accommodation> getAccommodations() {
        return accommodations;
    }

    public Map<String, Prescription> getPrescriptions() {
        return prescriptions;
    }
}
