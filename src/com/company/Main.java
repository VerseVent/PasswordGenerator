package com.company;

public class Main extends PasswordGenerator{
    public Main(boolean useLower, boolean useUpper, boolean useDigits, boolean usePunctuation) {
        super(useLower, useUpper, useDigits, usePunctuation);
    }

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        String password = passwordGenerator.generate(12);

        System.out.println(password);
    }
}
