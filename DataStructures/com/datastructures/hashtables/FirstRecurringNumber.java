package com.datastructures.hashtables;

import java.util.HashSet;

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]: It should return 2
//Given an array = [2,1,1,2,3,5,1,2,4]: It should return 1
//Given an array = [2,3,4,5]: It should return -1
//Given an array = [2,5,5,2,3,5,1,2,4]: return 5 because the pairs are before 2,2
public class FirstRecurringNumber {

    public static int getFirstRecurringNumber(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if(inputArray[i] == inputArray[j]) {
                    return inputArray[i];
                }
            }
        }
        return -1;
    }

    public static int getFirstRecurringNumberUsingHashing(int[] inputArray) {
        HashSet<Integer> numSet = new HashSet<>(); //Filling the hash table before checking if
        // the item exist
        for (Integer num : inputArray) {
            if (numSet.contains(num)) {
                return num; //first recurring number
            } else {
                numSet.add(num);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Object[] arr = {1,5,8,5,1,8,8,7,4,4,10};
        int[] arr1 = {2,1,1,2,3,5,1,2,4};
        int[] arr2 = {2,5,1,2,3,5,1,2,4};
        int[] arr3 = {2,3,4,5};
        int[] arr4 = {2,5,5,2,3,5,1,2,4};
        System.out.println(getFirstRecurringNumber(arr1)); // Returns 1 because the pairs are before 2,2

        System.out.println(getFirstRecurringNumberUsingHashing(arr2));

        System.out.println(getFirstRecurringNumberUsingHashing(arr3));
        System.out.println(getFirstRecurringNumberUsingHashing(arr4));

    }
}