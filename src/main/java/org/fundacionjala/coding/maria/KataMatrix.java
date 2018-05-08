package org.fundacionjala.coding.maria;

/**
 * Class KataMatrix that contains methods to revert a matrix.
 */
public class KataMatrix {
    private int dimension;
    private int[][] squarelotron;
    private static final int MAX_ROTATIONS = 4;
    private static final int NUMBER_ONE = 1;

    /**
     * KataMatrix set the dimension and contruct the matrix.
     * @param dimension the matrix dimension
     */
    public KataMatrix(int dimension) {
        this.dimension = dimension;
        this.squarelotron = loadMatrix(this.dimension);
    }

    /**
     * loadMatrix create a new matrix with the specific dimentions.
     * @param dimension int dimension
     * @return the matrix
     */
    public int[][] loadMatrix(int dimension) {
        int count = 1;
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = count;
                count++;
             }
        }
        return matrix;
    }

    /**
     * upsideDownFlip rever the matrix by rings.
     * @param ring the number of the ring
     * @return the matrix reverted
     */
    public KataMatrix upsideDownFlip(int ring) {
        ring = ring - NUMBER_ONE;
        int length = this.dimension - NUMBER_ONE;
        KataMatrix result = new KataMatrix(this.dimension);
        for (int i = ring; i < this.dimension / 2; i++) {
            for (int j = ring; j < this.dimension - ring;  j++) {
                if (i == ring || j == ring || j == this.dimension - ring - NUMBER_ONE) {
                    result.squarelotron[i][j] = this.squarelotron[length - i][j];
                    result.squarelotron[length - i][j] = this.squarelotron[i][j];
              }
            }
          }
        return result;
    }

    /**
     * mainDiagonalFlip revert the matrix by diagonal.
     * @param ring matrix ring
     * @return matrix reverted
     */
    public KataMatrix mainDiagonalFlip(int ring) {
        ring = ring - 1;
        KataMatrix result = new KataMatrix(this.dimension);
        for (int i = ring; i < this.dimension - ring; i++) {
            for (int j = ring; j < this.dimension - ring; j++) {
                if (ring == i || ring == j || i == this.dimension - ring - 1 || j == this.dimension - ring - 1) {
                    result.squarelotron[i][j] = this.squarelotron[j][i];
               }
            }
        }
        return result;
    }
    /**
     * rotate the matrix right or left.
     * @param numberOfTurns in
     */
    public void rotateRight(int numberOfTurns) {
        numberOfTurns = getNumberOfTurns(numberOfTurns);
        int length = this.dimension - 1;
        KataMatrix result = new KataMatrix(this.dimension);
        for (int h = 0; h < numberOfTurns; h++) {
            for (int i = 0; i < this.dimension; i++) {
                for (int j = 0; j < this.dimension;  j++) {
                    this.squarelotron[i][length - j] = result.squarelotron[j][i];
                }
            }
            result = setMatrix(result);
       }
    }

    /**
     * method setMatrix copy this to result matrix.
     * @param result matrix
     * @return matrix
     */
    public KataMatrix setMatrix(KataMatrix result) {
        for (int m = 0; m < this.dimension; m++) {
            result.squarelotron[m] = this.squarelotron[m].clone();
        }
        return result;
    }

    /**
     * getNumberOfTurns method to get the number of rotates.
     * @param numberOfTurns number of rotations
     * @return matrix
     */
    public int getNumberOfTurns(int numberOfTurns) {
        if (Math.abs(numberOfTurns) > MAX_ROTATIONS) {
            numberOfTurns = numberOfTurns % MAX_ROTATIONS;
        }
        numberOfTurns = numberOfTurns < MAX_ROTATIONS ? MAX_ROTATIONS + numberOfTurns : numberOfTurns;
        return numberOfTurns;
    }

    /**
     * getSquarematrix getter to get the matrix.
     * @return the matrix
     */
    public int[][] getSquarematrix() {
        return squarelotron.clone();
    }

}
