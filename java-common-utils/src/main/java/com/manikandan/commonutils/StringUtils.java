package com.manikandan.commonutils;

public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public static String capitalize(String value) {

        if (value == null) {
            return null;
        }

        if (value.isEmpty()) {
            return "";
        }

        return Character.toUpperCase(value.charAt(0))
                + value.substring(1);
    }

    public static String removeExtraSpaces(String value) {

        if (value == null) {
            return null;
        }

        return value.trim().replaceAll("\\s+", " ");
    }
}