package dev.idinaldo.brabank.auth.infrastructure.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Identity")
public class JpaIdentity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "National ID is mandatory")
    @Column(nullable = false)
    private String nationalIdMac;

    @NotNull(message = "National ID is mandatory")
    @Column(nullable = false)
    private String encryptedNationalId;

    @NotNull(message = "Password is mandatory")
    @Column(nullable = false)
    private String passwordHash;

    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
}
