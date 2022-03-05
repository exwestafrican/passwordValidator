package com.ait.agile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PasswordValidatorTest {

    PasswordValidator pv;

    /**
     * Rigorous Test :-)
     */
    @Before
    public void setUp() {
        pv = new PasswordValidator();
    }

    @Test
    public void testPasswordLenght() {
        assertEquals(true, pv.isValid("Abc123"));
    }

    @Test
    public void testCharactersAreConsecutive() {
        assertEquals(false, pv.validateNoneConsecutiveCharacters("AB1AC"));
    }

    @Test
    public void testCharactersAreNotConsecutive() {
        assertEquals(true, pv.validateNoneConsecutiveCharacters("A1ACEP"));
    }
}
