package org.fundacionjala.coding.jimmy;

import java.util.stream.IntStream;

/**
 * Class created in order to solve Squarelotron kata.
 */
public class Squarelotron {

    private int[][] squarelotron;
    private int size;

    /**
     * Constructor method.
     *
     * @param dimension the dimension of the matrix.
     */
    public Squarelotron(int dimension) {
        this.size = dimension;
        squarelotron = new int[dimension][dimension];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squarelotron[i][j] = size * i + j + 1;
            }
        }
    }

    /**
     * Method to swap the given matrix.
     *
     * @param squarelotron is the matrix.
     */
    private void swap(Squarelotron squarelotron) {
        IntStream.range(0, size).forEach(i ->
                System.arraycopy(this.squarelotron[i], 0, squarelotron.squarelotron[i], 0, size));
    }

    /**
     * This method performs the Upside-Down Flip of the squarelotron.
     *
     * @param ringNumber is the number of the ring.
     * @return The matrix up-sided down.
     */
    public Squarelotron upsideDownFlip(int ringNumber) {
        Squarelotron squarelo = new Squarelotron(size);
        this.swap(squarelo);
        int first = ringNumber - 1;
        int last = size - ringNumber;
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                if ((i == first || i == last) && j >= first && j <= last) {
                    squarelo.squarelotron[i][j] = this.squarelotron[size - 1 - i][j];
                }
            }
        }
        return squarelo;
    }

    /**
     * It gets the matrix.
     *
     * @return the matrix.
     */
    public int[][] getSquareMatrix() {
        return this.squarelotron.clone();
    }

    /**
     * This method performs the Main Diagonal Flip of the squarelotron.
     *
     * @param ringNumber the number of ring of the matrix.
     * @return the matrix flip.
     */
    public Squarelotron mainDiagonalFlip(int ringNumber) {
        int first = ringNumber - 1;
        int last = size - ringNumber;
        Squarelotron squarelo = new Squarelotron(size);
        this.swap(squarelo);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == first || i == last) && (j >= first && j <= last)
                        || (i > first && i < last) && (j == first || j == last)) {
                    squarelo.squarelotron[i][j] = this.squarelotron[j][i];
                }
            }
        }
        return squarelo;
    }

    /**
     * Method to clone the matrix.
     *
     * @param resMatrix          parameter result.
     * @param squarelotronMatrix parameter squarelotron.
     */
    private void cloneMatrix(int[][] resMatrix, int[][] squarelotronMatrix) {
        for (int i = 0; i < this.size; i++) {
            squarelotronMatrix[i] = resMatrix[i].clone();
        }
    }

    /**
     * Method to rotate the the matrix.
     *
     * @param numberOfTurns the number of rotations.
     */
    public void rotateRight(int numberOfTurns) {
        int[][] result = new int[this.size][this.size];
        while (Math.abs(numberOfTurns) > 0) {
            for (int i = 0; i < this.size; i++) {
                result[i] = this.squarelotron[i].clone();
                for (int j = 0; j < this.size; j++) {
                    if (numberOfTurns > 0) {
                        result[i][j] = this.squarelotron[(this.size - 1) - j][i];
                    }
                    if (numberOfTurns < 0) {
                        result[i][j] = this.squarelotron[j][(this.size - 1) - i];
                    }
                }
            }
            numberOfTurns += numberOfTurns / (Math.abs(numberOfTurns) * -1);
            cloneMatrix(result, this.squarelotron);
        }
    }
}
