package com.michaelhoffmantech.jhipster.monolith.sample.repository;

import com.michaelhoffmantech.jhipster.monolith.sample.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
