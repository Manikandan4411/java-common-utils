package com.manikandan.commonutils;

public class Main {

    public static void main(String[] args) {

        boolean isEmpty =
                StringUtils.isNullOrEmpty("");

        System.out.println(isEmpty);

        String capitalized =
                StringUtils.capitalize("java");

        System.out.println(capitalized);

        String cleaned =
                StringUtils.removeExtraSpaces(
                        "   Hello     World   "
                );

        System.out.println(cleaned);

        boolean validEmail =
                ValidationUtils.isValidEmail(
                        "user@test.com"
                );

        System.out.println(validEmail);
    }
}