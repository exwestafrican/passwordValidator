package com.ait.agile;

/**
 * Hello world!
 *
 */
public class PasswordValidator {

    public boolean isValid(String password) {

        return password.length() >= 5 && password.length() <= 10;
    }

    public boolean validateNoneConsecutiveCharacters(String password) {

        for (int idx = 0; idx < password.length() - 1; idx++) {
            char currentPasswordChar = password.charAt(idx);
            char nextPasswordChar = password.charAt(idx + 1);

            int nextAlphabet = (int) currentPasswordChar + 1;

            if ((int) nextPasswordChar == nextAlphabet)
                return false;

        }
        return true;
    }

}
