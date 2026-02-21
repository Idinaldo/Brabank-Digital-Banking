package dev.idinaldo.brabank.auth.adapters.controllers;

import dev.idinaldo.brabank.auth.adapters.in.dtos.IdentityRegisterDTO;
import dev.idinaldo.brabank.auth.application.services.IdentityService;
import dev.idinaldo.brabank.auth.domain.models.Identity;
import dev.idinaldo.brabank.auth.infrastructure.mappers.IdentityMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class IdentityController {

    private final IdentityService identityService;
    private final IdentityMapper identityMapper;

    public IdentityController(IdentityService identityService, IdentityMapper identityMapper) {
        this.identityService = identityService;
        this.identityMapper = identityMapper;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerClient(IdentityRegisterDTO identityRegisterDTO) {
        Identity identity = this.identityMapper.registerDtoToDomain(identityRegisterDTO);
        this.identityService.registerClient(identity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Identity Successfully created with ID: {id}");
    }

}
