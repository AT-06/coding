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
 * Test to Kata17.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class Kata17Test {

    private Kata17 kata;
    /**
     * init Kata.
     */
    @Before
    public void init() {

        kata = new Kata17();
    }
    /**
     * Test rmake readable method.
     */
    @Test
    public void testMakeReadable() {

        final int spected1 = 0;
        final int spected2 = 5;
        final int spected3 = 60;
        final int spected4 = 86399;
        final int spected5 = 359999;
        assertEquals("makeReadable(0)", "00:00:00", kata.makeReadable(spected1));
        assertEquals("makeReadable(5)", "00:00:05", kata.makeReadable(spected2));
        assertEquals("makeReadable(60)", "00:01:00", kata.makeReadable(spected3));
        assertEquals("makeReadable(86399)", "23:59:59", kata.makeReadable(spected4));
        assertEquals("makeReadable(359999)", "99:59:59", kata.makeReadable(spected5));
    }
}
