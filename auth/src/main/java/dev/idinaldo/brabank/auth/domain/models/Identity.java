package dev.idinaldo.brabank.auth.domain.models;

import dev.idinaldo.brabank.auth.domain.valueObjects.NationalId;
import jakarta.persistence.Id;

import java.util.UUID;

public class Identity {

    private UUID id;
    private NationalId nationalId;
    private String password;

    public Identity(UUID id, NationalId nationalId, String password) {
        this.id = id;
        this.nationalId = nationalId;
        this.password = password;
    }

    public Identity(NationalId nationalId, String password) {
        this.nationalId = nationalId;
        this.password = password;
    }

    public Identity() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public NationalId getNationalId() {
        return nationalId;
    }

    public void setNationalId(NationalId nationalId) {
        this.nationalId = nationalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
