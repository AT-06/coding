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
 * This class contains UnitTest to DuplicateEncoder.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class DuplicateEncoderTest {

    private DuplicateEncoder kata;

    /**
     * init Kata.
     */
    @Before
    public void init() {

        kata = new DuplicateEncoder();
    }

    /**
     * Test to simpleTest() method.
     */
    @Test
    public void testEncode() {
        assertEquals(")()())()(()()(", kata.encode("Prespecialized"));
        assertEquals("))))())))", kata.encode("   ()(   "));
    }
}
