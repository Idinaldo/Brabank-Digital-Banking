package dev.idinaldo.brabank.auth.domain.valueObjects;

import dev.idinaldo.brabank.auth.infrastructure.exceptions.InvalidNationalid;

public record NationalId(String value) {

    public NationalId(String value) {
        if (this.isValid(value)) {
            this.value = value;
        }
        throw new InvalidNationalid();
    }

    private boolean isValid(String value) {
        return value.matches("\\d{3}[.]\\d{3}[.]\\d{3}-\\d{2}");
    }
}
