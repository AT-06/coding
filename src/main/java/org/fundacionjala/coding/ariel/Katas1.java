package org.fundacionjala.coding.ariel;


/**
 * That class change.
 */
public class Katas1 {


    private static final int COND = 5;
    private String texto = "";
    private String[] parts = texto.split(" ");
    private String result = "";

    /**
     * That constructor init the class without args.
     */
    public Katas1() {
        this.texto = "";
    }

    /**
     * @param texto that constructor init the class with args
     */
    public Katas1(String texto) {
        this.texto = texto;
        this.parts = texto.split(" ");
    }

    /**
     * @param texto That method rot a word that has five characters.
     * @return return the word of five character but on reverse.
     */
    // change = new StringBuilder();
    public String changeRot(String texto) {

        for (String t : parts) {


            if (t.length() >= COND) {

                result += new StringBuilder(t).reverse() + " ";
            } else {
                result += t + " ";
            }
        }

        return result.trim();

    }

}
