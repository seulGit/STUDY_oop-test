package org.example.pwCheck;

import org.example.pwCheck.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}
