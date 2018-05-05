/*
* @(#)Squarelotron.java
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

/**
 * Squarelotron class.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class Squarelotron {

    private int[][] squarelotronMatrix;
    private int size;

    /**
     * Constructor to initialize squarelotronMatrix.
     *
     * @param sizeOfMatrix size of matrix.
     */
    public Squarelotron(int sizeOfMatrix) {

        // Initialize size of matrix.
        this.size = sizeOfMatrix;
        this.squarelotronMatrix = new int[sizeOfMatrix][sizeOfMatrix];

        // Fill matrix with sizeOfMatrix.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squarelotronMatrix[i][j] = size * i + j + 1;
            }
        }
    }

    /**
     * Method to upsideDownFlip squarelotronMatrix.
     *
     * @param ring integer value.
     * @return squarelotronResult, new squarelotronMatrix updated.
     */
    public Squarelotron upsideDownFlip(int ring) {
        Squarelotron squarelotronResult = new Squarelotron(this.size);
        int halfMatrix = (size - ring) / 2 + 1;

        for (int topNumber = ring - 1, bottomNumber = size - ring;
             topNumber < halfMatrix;
             topNumber++, bottomNumber--) {

            if (topNumber == ring - 1) {
                for (int k = ring - 1; k < size - ring + 1; k++) {
                    squarelotronResult.setData(topNumber, k, this.getData(bottomNumber, k));
                    squarelotronResult.setData(bottomNumber, k, this.getData(topNumber, k));
                }
            }
        }
        return squarelotronResult;
    }

    /**
     * Method to mainDiagonalFlip squarelotronMatrix.
     *
     * @param ring integer value.
     * @return squarelotronResult, new squarelotronMatrix updated.
     */
    public Squarelotron mainDiagonalFlip(int ring) {
        Squarelotron squarelotronResult = new Squarelotron(this.size);
        for (int i = ring - 1; i < size - ring + 1; i++) {
            squarelotronResult.setData(i, ring - 1, this.getData(ring - 1, i));
            squarelotronResult.setData(ring - 1, i, this.getData(i, ring - 1));
        }
        for (int j = ring; j < size - ring + 1; j++) {
            squarelotronResult.setData(j, size - ring, this.getData(size - ring, j));
            squarelotronResult.setData(size - ring, j, this.getData(j, size - ring));
        }
        return squarelotronResult;
    }

    /**
     * Method to return matrix.
     *
     * @return int[][] , matrix updated.
     */
    public int[][] getSquarematrix() {
        return squarelotronMatrix;
    }

    /**
     * Method to set data on Matrix.
     *
     * @param x    integer value.
     * @param y    integer value.
     * @param data integer value.
     */
    private void setData(int x, int y, int data) {
        this.squarelotronMatrix[x][y] = data;
    }

    /**
     * Method to return data from Matrix.
     *
     * @param x integer value.
     * @param y integer value.
     * @return int, data integer value.
     */
    private int getData(int x, int y) {
        return this.squarelotronMatrix[x][y];
    }
}
