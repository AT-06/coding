/**
 * Squarelotron
 *
 * The main assignment deals with more array manipulations.
 * We want you to program a bunch of operations for this object called a Squarelotron.
 */
package org.fundacionjala.coding.manuel;

/**
 * Squarelotron.java
 * Class for kata 18.
 */
public class Squarelotron {

    /**
     * Matrix attribute.*/
    private int[][] squarelotron;

    /**
     * Matrix' size attribute.*/
    private int size;

    /**
     * Constructor.
     * @param dimension the size of the matrix.
     */
    public Squarelotron(int dimension) {
        this.size = dimension;
        this.squarelotron = fillMatrix(this.size);
    }

    /**
     * Method to fill the matrix depending on its size.
     * @param size the size of the matrix.
     * @return the matrix with values.
     */
    public int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = size * i + j + 1;
            }
        }
        return matrix;
    }

    /**
     * Getter of matrix attribute.
     * @return the matrix.
     */
    public int[][] getSquarematrix() {
        return this.squarelotron.clone();
    }

    /**
     * Method to flip values from the matrix.
     * @param ringNumber the ring to flip values.
     * @return the matrix fliped.
     */
    public Squarelotron upsideDownFlip(int ringNumber) {
        Squarelotron result = new Squarelotron(this.size);
        int topLimit = this.size - ringNumber;
        int lowerLimit = (this.size - 1) - topLimit;
        for (int i = lowerLimit; i < this.size / 2; i++) {
            for (int j = lowerLimit; j <= topLimit; j++) {
                if (i == lowerLimit) {
                    result.squarelotron[i][j] = this.squarelotron[(i - (this.size - 1)) * (-1)][j];
                    result.squarelotron[(i - (this.size - 1)) * (-1)][j] = this.squarelotron[i][j];
                }
            }
        }
        return result;
    }

    /**
     * Method to flip main diagonal of the matrix.
     * @param ringNumber the ring to flip values.
     * @return the matrix fliped.
     */
    public Squarelotron mainDiagonalFlip(int ringNumber) {
        Squarelotron result = new Squarelotron(this.size);
        int topLimit = this.size - ringNumber;
        int lowerLimit = (this.size - 1) - topLimit;
        for (int i = lowerLimit; i <= topLimit; i++) {
            for (int  j = lowerLimit; j <= topLimit; j++) {
                if (j > i && (i == lowerLimit || j == topLimit)) {
                    result.squarelotron[i][j] = this.squarelotron[j][i];
                    result.squarelotron[j][i] = this.squarelotron[i][j];
                }
            }
        }
        return result;
    }

    /**
     * Method to rotate the matrix.
     * @param numberOfTurns the number or rotations to make.
     */
    public void rotateRight(int numberOfTurns) {
        int[][] result = new int[this.size][this.size];
        while (Math.abs(numberOfTurns) > 0) {
            for (int i = 0; i < this.size; i++) {
                result[i] = this.squarelotron[i].clone();
                for (int j = 0; j < this.size; j++) {
                    if (numberOfTurns > 0) {
                        result[i][j] = this.squarelotron[(this.size - 1) - j][i];
                    } else {
                        result[i][j] = this.squarelotron[j][(this.size - 1) - i];
                    }
                }
            }
            numberOfTurns += numberOfTurns / (Math.abs(numberOfTurns) * -1);
            cloneMatrix(result, this.squarelotron);
        }
    }

    /**
     * Method to clone a matrix.
     * @param matrixFrom the matrix origin to clone.
     * @param matrixTo the matrix destiny to clone.
     */
    public void cloneMatrix(int[][] matrixFrom, int[][] matrixTo) {
        for (int i = 0; i < this.size; i++) {
            matrixTo[i] = matrixFrom[i].clone();
        }
    }
}
