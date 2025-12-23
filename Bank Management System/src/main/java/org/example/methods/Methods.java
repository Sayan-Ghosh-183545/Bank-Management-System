package org.example.methods;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class Methods {

    private static final SecureRandom random = new SecureRandom();
    private static final Set<Integer> usedPins = new HashSet<>();

    public static int getPin() {
        int pin;
        do {
            pin = 1000 + random.nextInt(9000);
        } while (usedPins.contains(pin));

        usedPins.add(pin);
        return pin;
    }
}
