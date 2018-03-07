package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2/22/2018.
 */
public class Kata1Test {
    private Kata1 kata1;
    /**
     *Method to initialize object.
     */
    @Before public void initialize() {
        kata1 = new Kata1();
    }
    /**
     *First test.
     */
    @Test
    public void spinASentence1() {
        assertEquals("Hey wollef sroirraw", kata1.spinWord("Hey fellow warriors"));
    }

    /**
     *Second test.
     */
    @Test
    public void spinASentence2() {
        assertEquals("This is a test", kata1.spinWord("This is a test"));
    }

    /**
     *Third test.
     */
    @Test
    public void spinASentence3() {
        assertEquals("This is rehtona test", kata1.spinWord("This is another test"));
    }
}
