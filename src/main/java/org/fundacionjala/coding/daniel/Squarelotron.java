package org.fundacionjala.coding.daniel;

public class Squarelotron {
    public Squarelotron(int dimension) {
        int[][] matrix = new int[dimension][dimension];
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = counter++;
            }
        }
    }

   /* public Squarelotron upsideDownFlip(int ringNumber) {
    }


    public int[][] getSquarematrix() {
    }

    public Squarelotron mainDiagonalFlip(int ringNumber) {
    }

    public void rotateRight(int numberOfTurns) {
    }*/

}
