package org.fundacionjala.coding.manuel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2/23/2018.
 */
public class Kata2Test {
    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort1() {
        Kata2 kata2 = new Kata2("sort the inner content in descending order");
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", kata2.sortInnerContent());
    }

    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort2() {
        Kata2 kata2 = new Kata2("wait for me");
        assertEquals("wiat for me", kata2.sortInnerContent());
    }

    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort3() {
        Kata2 kata2 = new Kata2("this kata is easy");
        assertEquals("tihs ktaa is esay", kata2.sortInnerContent());
    }

    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort4() {
        Kata2 kata2 = new Kata2("I am");
        assertEquals("I am", kata2.sortInnerContent());
    }

}
