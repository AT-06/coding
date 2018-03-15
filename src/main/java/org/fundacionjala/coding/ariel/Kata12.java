package org.fundacionjala.coding.ariel;

/**
 * Kata 12.
 * By Ariel Gonzales Vargas.
 */
public class Kata12 {

    private static final int MAGIC = 50;

    /**
     * @param position An int number that tell the position.
     * @return The position score.
     */
    public int getScore(int position) {
        return (position != 1) ? getScore(position - 1) + position * MAGIC : position * MAGIC;
    }
}
