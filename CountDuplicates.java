package com;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        Map<String, Integer> dupStrings = new HashMap<>();
        for (String s : input) {
            Integer keyObj = dupStrings.get(s);
            if (keyObj == null) {
                dupStrings.put(s, 1);
            } else {
                dupStrings.put(s, dupStrings.get(s) + 1);
            }
        }
        int duplicateCounter = 0;
        for (Map.Entry<String, Integer> mapElement : dupStrings.entrySet()) {
            if (mapElement.getValue() > 1) {
                duplicateCounter++;
            }
        }
        return duplicateCounter;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        Map<Integer, Integer> dupIntegers = new HashMap<>();
        for (Integer integer : input) {
            Integer keyObj = dupIntegers.get(integer);
            if (keyObj == null) {
                dupIntegers.put(integer, 1);
            } else {
                dupIntegers.put(integer, dupIntegers.get(integer) + 1);
            }
        }
        int duplicateCounter = 0;
        for (Map.Entry<Integer, Integer> mapElement : dupIntegers.entrySet()) {
            if (mapElement.getValue() > 1) {
                duplicateCounter++;
            }
        }
        return duplicateCounter;
    }
}
