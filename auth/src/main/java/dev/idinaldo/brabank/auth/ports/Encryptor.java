package dev.idinaldo.brabank.auth.ports;

import org.springframework.stereotype.Component;

@Component
public interface Encryptor {
    String encrypt(String plaintext);
    String decrypt(String ciphertext, String encryptionKey);
}
