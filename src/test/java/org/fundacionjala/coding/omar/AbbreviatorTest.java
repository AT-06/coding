/*
 * @(#)AbbreviatorTest.java
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
 * This class is to test Abbreviate kata.
 *
 */
public class AbbreviatorTest {

    private Abbreviator kata;

    /**
     * init Kata.
     */
    @Before
    public void init() {

        kata = new Abbreviator();
    }

    /**
     * This method is to test abbreviate method.
     *
     */
    @Test
    public void testInternationalization() {
        assertEquals("i18n", kata.abbreviate("internationalization"));
    }

}
