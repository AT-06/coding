package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarVigenereCipherTest {

    CaesarVigenereCipher cvc = new CaesarVigenereCipher();

    @Test
    public void caesarEncodeTests() {
        final String a = "HOLA";
        final String b = "Zorro";
        final String c = "KROD";
        final String d = "ETWWT";
        final String e = "";
        final String f = "K?O*";
        final String g = "H?L*";
        assertEquals(c, cvc.caesarEncode(a, 3));
        assertEquals(d, cvc.caesarEncode(b, 5));
        assertEquals(e, cvc.caesarEncode(null, 3));
        assertEquals(e, cvc.caesarEncode(e, 3));
        assertEquals(f, cvc.caesarEncode(g, 3));
    }

    @Test
    public void caesarDecodeTests() {
        final String a = "HOLA";
        final String b = "ZORRO";
        final String c = "KROD";
        final String d = "ETWWT";
        final String e = "";
        final String f = "K?O*";
        final String g = "H?L*";
        assertEquals(a, cvc.caesarDecode(c, 3));
        assertEquals(b, cvc.caesarDecode(d, 5));
        assertEquals(e, cvc.caesarDecode(e, 3));
        assertEquals(e, cvc.caesarDecode(null, 3));
        assertEquals(g, cvc.caesarDecode(f, 3));
    }

    @Test
    public void vigenereEncodeTests() {
        final String key = "LIMON";
        final String text = "HOLA JALASOFT";
        final String message = "TXYP XMUNHCRC";
        assertEquals(message, cvc.vigenereEncode(text,key));
    }

    @Test
    public void vigenereDecodeTests() {
        final String key = "LIMON";
        final String text = "HOLA JALASOFT";
        final String message = "TXYP XMUNHCRC";
        assertEquals(text, cvc.vigenereEncode(message,"NQMKL"));
    }
}