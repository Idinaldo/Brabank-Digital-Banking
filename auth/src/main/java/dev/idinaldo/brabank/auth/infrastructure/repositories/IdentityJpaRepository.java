package dev.idinaldo.brabank.auth.infrastructure.repositories;

import dev.idinaldo.brabank.auth.adapters.out.entities.JpaIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IdentityJpaRepository extends JpaRepository<JpaIdentity, UUID> {
}
