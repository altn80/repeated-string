/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.repeated.string;

/**
 *
 * @author kbos
 */
public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int strSize = s.length();
        long repetitions = new Double(Math.ceil(n / strSize)).longValue();
        long offset = n % strSize;
        long quantityA = s.chars().filter(c -> c == 'a').count();

        long partial = quantityA * repetitions;

        for (int i = 0; i < offset; i++) {
            if(s.toCharArray()[i] == 'a') {
                partial++;
            }
        }
        return partial;

    }

}
