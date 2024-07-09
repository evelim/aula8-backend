package br.com.pecepoli.demo.repository;

import br.com.pecepoli.demo.domain.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface PacoteRepository extends JpaRepository<Pacote, UUID> {
}
