package dev.idinaldo.brabank.auth.ports;

import org.springframework.stereotype.Component;

@Component
public interface MacGenerator {
    String generateMac(String plaintext);
}
