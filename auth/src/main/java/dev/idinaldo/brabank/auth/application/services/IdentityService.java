package dev.idinaldo.brabank.auth.application.services;

import dev.idinaldo.brabank.auth.application.usecases.ClientRegisterUseCase;
import dev.idinaldo.brabank.auth.domain.models.Identity;
import dev.idinaldo.brabank.auth.ports.IdentityRepository;
import org.springframework.stereotype.Service;

@Service
public class IdentityService implements ClientRegisterUseCase {

    private final IdentityRepository identityRepository;

    public IdentityService(IdentityRepository identityRepository) {
        this.identityRepository = identityRepository;
    }

    @Override
    public void registerClient(Identity identity) {
        this.identityRepository.save(identity);
    }
}
