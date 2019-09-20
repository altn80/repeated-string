/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.repeated.string;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kbos
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertEquals(7l, Solution.repeatedString("aba", 10l));
    }
    
    @Test
    public void test2() {
        Assert.assertEquals(1000000000000l, Solution.repeatedString("a", 1000000000000l));
    }

}
