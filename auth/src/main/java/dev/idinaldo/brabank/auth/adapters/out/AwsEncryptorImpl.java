package dev.idinaldo.brabank.auth.adapters.out;

import dev.idinaldo.brabank.auth.ports.Encryptor;

public class AwsEncryptorImpl implements Encryptor {

    @Override
    public String encrypt(String plaintext) {
        return "";
    }

    @Override
    public String decrypt(String ciphertext, String encryptionKey) {
        return "";
    }
}
