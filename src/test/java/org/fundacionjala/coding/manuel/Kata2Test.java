package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2/23/2018.
 */
public class Kata2Test {
    private Kata2 kata2;


    /**
     * Initialize method.
     */
    @Before public void initialize() {
        kata2 = new Kata2();
    }
    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort1() {
        final String param = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", kata2.sortInnerContent(param));
    }

    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort2() {
        assertEquals("wiat for me", kata2.sortInnerContent("wait for me"));
    }

    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort3() {
        assertEquals("tihs ktaa is esay", kata2.sortInnerContent("this kata is easy"));
    }

    /**
     * Verificar que las palabras de una oracion hayan sido ordenadas.
     */
    @Test
    public void aStringInnerContentIsSort4() {
        assertEquals("I am", kata2.sortInnerContent("I am"));
    }

}
