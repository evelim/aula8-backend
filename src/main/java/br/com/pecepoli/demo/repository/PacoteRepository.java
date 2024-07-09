package br.com.pecepoli.demo.repository;

import br.com.pecepoli.demo.domain.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.UUID;


@Repository
public interface PacoteRepository extends JpaRepository<Pacote, UUID> {
    @Query("SELECT u FROM Pacote u WHERE u.descricao LIKE CONCAT('%',:criteria,'%') OR u.localidade.descricao LIKE CONCAT('%',:criteria,'%')")
    List<Pacote> findPacotesByCriteria(@Param("criteria") String criteria);
}
