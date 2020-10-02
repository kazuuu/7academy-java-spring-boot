package br.com.sevencomm.cobrancainterna.data.repositories;

import br.com.sevencomm.cobrancainterna.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}