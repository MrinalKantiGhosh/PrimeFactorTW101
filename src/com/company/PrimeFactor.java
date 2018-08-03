package com.company;

import java.util.ArrayList;

public class PrimeFactor {
    ArrayList<Integer> result;

    PrimeFactor(){
        result = new ArrayList<>();
    }

    public ArrayList<Integer> getPrimeFactor(int num){
        while(num % 2 == 0){
            result.add(2);
            num/= 2;
        }
        for(int itr = 3; itr <= Math.sqrt(num); itr = itr+2) {
            while (num % itr == 0) {
                result.add(itr);
                num /= itr;
            }
        }
        result.add(num);
        return result;
    }
}
