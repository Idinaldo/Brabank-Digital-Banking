package dev.idinaldo.brabank.auth.adapters.out;

import dev.idinaldo.brabank.auth.ports.MacGenerator;

public class AwsMacGeneratorImpl implements MacGenerator {
    @Override
    public String generateMac(String plaintext) {
        return "";
    }
}
