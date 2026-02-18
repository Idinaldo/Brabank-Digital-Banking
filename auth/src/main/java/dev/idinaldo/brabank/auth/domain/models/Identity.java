package dev.idinaldo.brabank.auth.domain.models;

import dev.idinaldo.brabank.auth.domain.valueObjects.NationalId;

import java.util.UUID;

public class Identity {

    private UUID id;
    private NationalId nationalId;
    private String password;
}
