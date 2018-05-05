/*
* @(#)SquarelotronTest.java
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
+ */
package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * It is in charged to define the unit tests for Squarelotron class.
 */
public class SquarelotronTest {

    /**
     * Upside Down Flip Basic Test using Squarelotron with dimension two and ring one.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionTwo() {
        final int ringNumber = 1;
        final int dimension = 2;
        final Squarelotron squarelotron = new Squarelotron(dimension);
        final int[][] expectedMatrix = {{3, 4}, {1, 2}};
        Squarelotron result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Upside Down Flip Basic Test using Squarelotron with dimension three and ring one.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionThree() {
        final int ringNumber = 1;
        final int dimension = 3;
        final Squarelotron squarelotron = new Squarelotron(dimension);
        final int[][] expectedMatrix = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        Squarelotron result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Upside Down Flip Extended Test using Squarelotron with dimension four and ring two.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionFourRingTwo() {
        final int ringNumber = 2;
        final int dimension = 4;
        final Squarelotron squarelotron = new Squarelotron(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 10, 11, 8}, {9, 6, 7, 12}, {13, 14, 15, 16}};
        Squarelotron result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Upside Down Flip Extended Test using Squarelotron with dimension five and ring three.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionFiveRingThree() {
        final int ringNumber = 3;
        final int dimension = 5;
        final Squarelotron squarelotron = new Squarelotron(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        Squarelotron result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Main Diagonal Flip Test using Squarelotron with dimension four and ring one.
     */
    @Test
    public void testMainDiagonalFlipMatrixDimensionFourRingOne() {
        final int ringNumber = 1;
        final int dimension = 4;
        final Squarelotron squarelotron = new Squarelotron(dimension);
        final int[][] expectedMatrix = {{1, 5, 9, 13}, {2, 6, 7, 14}, {3, 10, 11, 15}, {4, 8, 12, 16}};
        Squarelotron result = squarelotron.mainDiagonalFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Main Diagonal Flip Test using Squarelotron with dimension four and ring two.
     */
    @Test
    public void testMainDiagonalFlipMatrixDimensionFourRingTwo() {
        final int ringNumber = 2;
        final int dimension = 4;
        final Squarelotron squarelotron = new Squarelotron(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 6, 10, 8}, {9, 7, 11, 12}, {13, 14, 15, 16}};
        Squarelotron result = squarelotron.mainDiagonalFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }
}
