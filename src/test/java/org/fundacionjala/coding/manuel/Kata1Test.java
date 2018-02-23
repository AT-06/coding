package org.fundacionjala.coding.manuel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2/22/2018.
 */
public class Kata1Test {

    /**
     *First test.
     */
    @Test
    public void spinASentence1() {
        Kata1 kata1 = new Kata1("Hey fellow warriors");
        assertEquals("Hey wollef sroirraw", kata1.spinWord());
    }

    /**
     *Second test.
     */
    @Test
    public void spinASentence2() {
        Kata1 kata1 = new Kata1("This is a test");
        assertEquals("This is a test", kata1.spinWord());
    }

    /**
     *Third test.
     */
    @Test
    public void spinASentence3() {
        Kata1 kata1 = new Kata1("This is another test");
        assertEquals("This is rehtona test", kata1.spinWord());
    }
}
