/*
 * @(#)Kata16Test.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * Address
 * All rights reserved.
 *
 * This software is the confidential and propietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 */
package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test to Kata16.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class Kata16Test {

    private Kata16 kata;
    /**
     * init Kata.
     */
    @Before
    public void init() {

        kata = new Kata16();
    }
    /**
     * Test reverse word method.
     */
    @Test
    public void testReverseWords() {
        assertEquals(kata.reverseWords("I like eating"), "eating like I");
        assertEquals(kata.reverseWords("I like flying"), "flying like I");
        assertEquals(kata.reverseWords("The world is nice"), "nice is world The");
    }
}
