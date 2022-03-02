package com.ait.agile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PasswordValidatorTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPasswordLenght() {
        PasswordValidator pv = new PasswordValidator();
        assertEquals(true, pv.isValid("Abc123"));
    }
}
