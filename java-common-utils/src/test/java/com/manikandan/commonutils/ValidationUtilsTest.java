package com.manikandan.commonutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsTest {

    @Test
    void shouldAcceptValidEmail() {
        assertTrue(
                ValidationUtils.isValidEmail(
                        "user@test.com"
                )
        );
    }

    @Test
    void shouldRejectNullEmail() {
        assertFalse(
                ValidationUtils.isValidEmail(null)
        );
    }

    @Test
    void shouldRejectEmptyEmail() {
        assertFalse(
                ValidationUtils.isValidEmail("")
        );
    }

    @Test
    void shouldRejectInvalidEmail() {
        assertFalse(
                ValidationUtils.isValidEmail(
                        "invalid-email"
                )
        );
    }
}