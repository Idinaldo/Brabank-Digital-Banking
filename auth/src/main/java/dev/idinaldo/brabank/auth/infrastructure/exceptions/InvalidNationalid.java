package dev.idinaldo.brabank.auth.infrastructure.exceptions;

public class InvalidNationalid extends RuntimeException {

    // default message
    // this is the pattern Brabank follows to avoid account mapping
    public InvalidNationalid() {
        super("Please verify your data.");
    }
}
