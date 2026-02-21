package dev.idinaldo.brabank.auth.adapters.out.repositories;

import dev.idinaldo.brabank.auth.adapters.out.entities.JpaIdentity;
import dev.idinaldo.brabank.auth.domain.models.Identity;
import dev.idinaldo.brabank.auth.infrastructure.mappers.IdentityMapper;
import dev.idinaldo.brabank.auth.infrastructure.repositories.IdentityJpaRepository;
import dev.idinaldo.brabank.auth.ports.IdentityRepository;

public class IdentityRepositoryImpl implements IdentityRepository {

    private final IdentityJpaRepository jpaRepository;
    private final IdentityMapper identityMapper;

    public IdentityRepositoryImpl(IdentityJpaRepository jpaRepository, IdentityMapper identityMapper) {
        this.jpaRepository = jpaRepository;
        this.identityMapper = identityMapper;
    }

    @Override
    public void save(Identity identity) {
        JpaIdentity jpaIdentity = this.identityMapper.domainToEntity(identity);
        this.jpaRepository.save(jpaIdentity);
    }
}
