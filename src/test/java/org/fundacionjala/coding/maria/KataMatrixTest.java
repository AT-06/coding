package org.fundacionjala.coding.maria;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * test for KataMatrix class.
 */
public class KataMatrixTest {

    /**
     * Upside Down Flip Basic Test using Squarelotron with dimension two and ring one.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionTwo() {
        final int ringNumber = 1;
        final int dimension = 2;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{3, 4}, {1, 2}};
        KataMatrix result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Upside Down Flip Basic Test using Squarelotron with dimension three and ring one.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionThree() {
        final int ringNumber = 1;
        final int dimension = 3;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        KataMatrix result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Upside Down Flip Extended Test using Squarelotron with dimension four and ring two.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionFourRingTwo() {
        final int ringNumber = 2;
        final int dimension = 4;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 10, 11, 8}, {9, 6, 7, 12}, {13, 14, 15, 16}};
        KataMatrix result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Upside Down Flip Extended Test using Squarelotron with dimension five and ring three.
     */
    @Test
    public void testUpsideDownFlipMatrixDimensionFiveRingThree() {
        final int ringNumber = 3;
        final int dimension = 5;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        KataMatrix result = squarelotron.upsideDownFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Main Diagonal Flip Test using Squarelotron with dimension four and ring one.
     */
    @Test
    public void testMainDiagonalFlipMatrixDimensionFourRingOne() {
        final int ringNumber = 1;
        final int dimension = 4;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 5, 9, 13}, {2, 6, 7, 14}, {3, 10, 11, 15}, {4, 8, 12, 16}};
        KataMatrix result = squarelotron.mainDiagonalFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Main Diagonal Flip Test using Squarelotron with dimension four and ring two.
     */
    @Test
    public void testMainDiagonalFlipMatrixDimensionFourRingTwo() {
        final int ringNumber = 2;
        final int dimension = 4;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 6, 10, 8}, {9, 7, 11, 12}, {13, 14, 15, 16}};
        KataMatrix result = squarelotron.mainDiagonalFlip(ringNumber);
        assertArrayEquals(expectedMatrix, result.getSquarematrix());
    }

    /**
     * Rotate Clock Wise Test using Squarelotron with dimension four.
     */
    @Test
    public void testRotateClockwise() {
        final int dimension = 4;
        final int numberOfTurns = 1;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        squarelotron.rotateRight(numberOfTurns);
        assertArrayEquals(expectedMatrix, squarelotron.getSquarematrix());
    }

    /**
     * Rotate Counter Clock Wise Test using Squarelotron with dimension four.
     */
    @Test
    public void testRotateCounterClockwise() {
        final int dimension = 4;
        final int numberOfTurns = -2;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        squarelotron.rotateRight(numberOfTurns);
        assertArrayEquals(expectedMatrix, squarelotron.getSquarematrix());
    }
    /**
     * Rotate Clock Wise Test using Squarelotron with dimension four and zero number of turns.
     */
    @Test
    public void testRotateClockwiseZeroTurns() {
        final int dimension = 4;
        final int numberOfTurns = 0;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        squarelotron.rotateRight(numberOfTurns);
        assertArrayEquals(expectedMatrix, squarelotron.getSquarematrix());
    }

    /**
     * Rotate Clock Wise Test using Squarelotron with dimension four and four number of turns.
     */
    @Test
    public void testRotateClockwiseEntireTurn() {
        final int dimension = 4;
        final int numberOfTurns = 4;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        squarelotron.rotateRight(numberOfTurns);
        assertArrayEquals(expectedMatrix, squarelotron.getSquarematrix());
    }

    /**
     * Rotate Counter Clock Wise Test using Squarelotron with dimension four and four number of turns.
     */
    @Test
    public void testRotateCounterClockwiseEntireTurn() {
        final int dimension = 4;
        final int numberOfTurns = -4;
        final KataMatrix squarelotron = new KataMatrix(dimension);
        final int[][] expectedMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        squarelotron.rotateRight(numberOfTurns);
        assertArrayEquals(expectedMatrix, squarelotron.getSquarematrix());
    }

}
