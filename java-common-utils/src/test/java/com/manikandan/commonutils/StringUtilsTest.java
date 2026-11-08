package com.manikandan.commonutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void shouldReturnTrueWhenNull() {
        assertTrue(StringUtils.isNullOrEmpty(null));
    }

   @Test
    void shouldReturnTrueWhenEmpty() {
        assertTrue(StringUtils.isNullOrEmpty(""));
    }

   @Test
    void shouldReturnFalseWhenValueExists() {
        assertFalse(StringUtils.isNullOrEmpty("Java"));
    }

    @Test
    void shouldCapitalizeWord() {
        assertEquals("Java",
                StringUtils.capitalize("java"));
    }
    @Test
    void shouldHandleNullCapitalize() {
        assertNull(StringUtils.capitalize(null));
   }

    @Test
    void shouldRemoveExtraSpaces() {
        assertEquals(
                "Hello World",
               StringUtils.removeExtraSpaces(
                        "  Hello    World "
                )
        );
    }

    @Test
    void shouldHandleNullSpaces() {
        assertNull(
                StringUtils.removeExtraSpaces(null)
        );
    }
}