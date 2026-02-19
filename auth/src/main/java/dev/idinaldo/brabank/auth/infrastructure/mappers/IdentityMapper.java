package dev.idinaldo.brabank.auth.infrastructure.mappers;

import dev.idinaldo.brabank.auth.adapters.in.IdentityRegisterDTO;
import dev.idinaldo.brabank.auth.domain.models.Identity;
import dev.idinaldo.brabank.auth.domain.valueObjects.NationalId;
import org.mapstruct.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper
public class IdentityMapper {

    private final PasswordEncoder passwordEncoder;

    public IdentityMapper(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public Identity registerDtoToDomain(IdentityRegisterDTO identityRegisterDTO) {
        Identity identity = new Identity();

        identity.setPassword(this.passwordEncoder.encode(identityRegisterDTO.rawPassword()));
        NationalId nationalId = new NationalId(identityRegisterDTO.nationalId());
        identity.setNationalId(nationalId);

        return identity;
    }
}
