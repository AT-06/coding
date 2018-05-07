package org.fundacionjala.coding.manuel;

public class Kata18 {

    private int[][] squarelotron;
    private int size;

    public Kata18(int dimension) {
        this.size = dimension;
        this.squarelotron = fillMatrix(this.size);
    }

    public int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (size * i) + j + 1;
            }
        }
        return matrix;
    }

    public int[][] getSquarematrix() {
        return this.squarelotron;
    }

    public Kata18 upsideDownFlip(int ringNumber) {
        int topLimit = this.size - ringNumber;
        int lowerLimit = (this.size - 1) - topLimit;
        for (int i = lowerLimit; i < this.size / 2; i++) {
            for (int j = lowerLimit; j <= topLimit; j++) {
                if (i == lowerLimit || j == lowerLimit || j == topLimit) {
                    int aux = this.squarelotron[i][j];
                    this.squarelotron[i][j] = this.squarelotron[(i - (this.size - 1)) * (-1)][j];
                    this.squarelotron[(i - (this.size - 1)) * (-1)][j] = aux;
                }
            }
        }
        return this;
    }
    public Kata18 mainDiagonalFlip(int ringNumber) {
        int topLimit = this.size - ringNumber;
        int lowerLimit = (this.size - 1) - topLimit;
        for (int i = lowerLimit; i <= topLimit; i++) {
            for (int  j = lowerLimit; j <= topLimit; j++) {
                if (j > i && (i == lowerLimit || j == topLimit)) {
                    int aux = this.squarelotron[i][j];
                    this.squarelotron[i][j] = this.squarelotron[j][i];
                    this.squarelotron[j][i] = aux;
                }
            }
        }
        return this;
    }
    public void rotateRight(int numberOfTurns) {
        int[][] result = new int[this.size][this.size];
        while(Math.abs(numberOfTurns) > 0) {
            for (int i = 0; i < this.size; i++) {
                result[i] = this.squarelotron[i].clone();
                for (int j = 0; j < this.size; j++) {
                    if (numberOfTurns > 0) {
                        result[i][j] = this.squarelotron[(this.size - 1) - j][i];
                    } else if(numberOfTurns < 0) {
                        result[i][j] = this.squarelotron[j][(this.size - 1) - i];
                    }
                }
            }
            numberOfTurns += numberOfTurns / (Math.abs(numberOfTurns) * -1);
            cloneMatrix(result, this.squarelotron);
        }
    }

    public void cloneMatrix(int[][] matrixFrom, int[][] matrixTo) {
        for (int i = 0; i < this.size; i++) {
            matrixTo[i] = matrixFrom[i].clone();
        }
    }
}
