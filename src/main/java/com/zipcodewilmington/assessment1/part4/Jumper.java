package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        double amountOfJJumps = Math.floor(k/j);
        double differenceLeftOver = k%j;
        return (int)(amountOfJJumps+differenceLeftOver);
    }
}
