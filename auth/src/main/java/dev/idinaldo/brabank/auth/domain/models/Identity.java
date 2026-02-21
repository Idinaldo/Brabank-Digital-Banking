package dev.idinaldo.brabank.auth.domain.models;

import dev.idinaldo.brabank.auth.domain.valueObjects.NationalId;

import java.util.UUID;

public class Identity {

    private UUID id;
    private NationalId nationalId;
    private String passwordHash;

    public Identity(UUID id, NationalId nationalId, String passwordHash) {
        this.id = id;
        this.nationalId = nationalId;
        this.passwordHash = passwordHash;
    }

    public Identity(NationalId nationalId, String passwordHash) {
        this.nationalId = nationalId;
        this.passwordHash = passwordHash;
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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
