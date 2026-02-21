package dev.idinaldo.brabank.auth.infrastructure.mappers;

import dev.idinaldo.brabank.auth.adapters.in.dtos.IdentityRegisterDTO;
import dev.idinaldo.brabank.auth.adapters.out.entities.JpaIdentity;
import dev.idinaldo.brabank.auth.domain.models.Identity;
import dev.idinaldo.brabank.auth.domain.valueObjects.NationalId;
import dev.idinaldo.brabank.auth.ports.Encryptor;
import dev.idinaldo.brabank.auth.ports.MacGenerator;
import org.mapstruct.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper
public class IdentityMapper {

    private final Encryptor encryptor;
    private final MacGenerator macGenerator;
    private final PasswordEncoder passwordEncoder;

    public IdentityMapper(Encryptor encryptor, PasswordEncoder passwordEncoder, MacGenerator macGenerator) {
        this.encryptor = encryptor;
        this.passwordEncoder = passwordEncoder;
        this.macGenerator = macGenerator;
    }

    public Identity registerDtoToDomain(IdentityRegisterDTO identityRegisterDTO) {
        Identity identity = new Identity();

        identity.setPasswordHash(this.passwordEncoder.encode(identityRegisterDTO.rawPassword()));

        NationalId nationalId = new NationalId(identityRegisterDTO.nationalId());
        identity.setNationalId(nationalId);

        return identity;
    }

    public JpaIdentity domainToEntity(Identity identity) {
        JpaIdentity jpaIdentity = new JpaIdentity();

        jpaIdentity.setPasswordHash(identity.getPasswordHash());
        jpaIdentity.setEncryptedNationalId(this.encryptor.encrypt(identity.getNationalId().value()));
        jpaIdentity.setNationalIdMac(this.macGenerator.generateMac(identity.getNationalId().value()));

        return jpaIdentity;
    }
}
