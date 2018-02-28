package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * That test check the method rot..
 */
public class Katas1Test {
    /**
     * That test "Hey fellow warriors" .
     */
    @Test
    public void rotText() {
        Katas1 text = new Katas1("Hey fellow warriors");
        assertEquals(text.changeRot("Hey fellow warriors"), "Hey wollef sroirraw");
    }

    /**
     * the test check "This is a test ".
     */
    @Test
    public void equalsAnswer() {
        Katas1 text = new Katas1("This is a test ");
        assertEquals("This is a test", text.changeRot("This is a test"));
    }

    /**
     * the text "This is rehtona test ".
     */
    @Test
    public void rotText2() {
        Katas1 text = new Katas1("This is another test ");
        assertEquals("This is rehtona test", text.changeRot("This is another test"));
    }

}
