package dev.idinaldo.brabank.auth.application.usecases;

import dev.idinaldo.brabank.auth.domain.models.Identity;

public interface ClientRegisterUseCase {
    void registerClient(Identity identity);
}
