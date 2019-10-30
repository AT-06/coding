package org.fundacionjala.coding.maria.cifrado;
/**
 * Class Cifrado.
 */
public abstract class Cifrado {
    private static final char A_POSITION = 'A';
    private static final char Z_POSITION = 'Z';
    private static final int ABC_SIZE = 26;
    /**
     * Method encode message with a key.
     * @param sentence String message.
     * @param key can be int or String.
     * @return a encode message.
     */
    public abstract String encode(String sentence, Object key);

    /**
     * Method decode message with a key.
     * @param sentence sentence String message.
     * @param key can be int or String.
     * @return a decode message.
     */
    public abstract String decode(String sentence, Object key);

    /**
     * Method getPosition to get the new ascii position.
     * @param pos int position.
     * @param key int key.
     * @return a new int.
     */
    public int getPosition(int pos, int key) {
        if (pos >= A_POSITION && pos <= Z_POSITION) {
            pos += key;
            pos = pos > Z_POSITION ? pos - ABC_SIZE : pos;
            pos = pos < A_POSITION ? pos + ABC_SIZE : pos;
        }
        return pos;
    }
}
