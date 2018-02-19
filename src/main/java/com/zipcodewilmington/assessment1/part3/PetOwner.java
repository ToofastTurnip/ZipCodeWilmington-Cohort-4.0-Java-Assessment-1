package com.zipcodewilmington.assessment1.part3;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String name;
    Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        /*
        ArrayList<Pet> temp = new ArrayList<>(Arrays.asList(pets));
        temp.add(pet);
        this.pets = temp.toArray(new Pet[temp.size()]);
        */

        this.pets[0] = pet;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals(pet)) {
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pet.equals(pets[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer[] ageArray = new Integer[pets.length];
        for (int i = 0; i < pets.length; i++) {
            ageArray[i] = (pets[i].getAge());
        }
        Arrays.sort(ageArray);
        return ageArray[0];
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer[] ageArray = new Integer[pets.length];
        for (int i = 0; i < pets.length; i++) {
            ageArray[i] = (pets[i].getAge());
        }
        Arrays.sort(ageArray);
        return ageArray[ageArray.length - 1];
    }

    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] ageArray = new Integer[pets.length];
        for (int i = 0; i < pets.length; i++) {
            ageArray[i] = (pets[i].getAge());
        }
        Float sum = (float)getSum(ageArray);
        return sum/ageArray.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }

    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int i : intArray)
            sum += i;
        return sum;
    }
}