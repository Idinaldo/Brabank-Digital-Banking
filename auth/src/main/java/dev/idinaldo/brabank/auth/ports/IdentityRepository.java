package dev.idinaldo.brabank.auth.ports;

import dev.idinaldo.brabank.auth.domain.models.Identity;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityRepository {
    void save(Identity identity);
}
