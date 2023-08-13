package org.example.pwCheck;

import org.example.pwCheck.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
