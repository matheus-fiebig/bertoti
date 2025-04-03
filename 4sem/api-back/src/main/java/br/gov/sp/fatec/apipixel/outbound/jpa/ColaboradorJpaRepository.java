package br.gov.sp.fatec.apipixel.outbound.jpa;

import br.gov.sp.fatec.apipixel.core.domain.entity.Colaborador;
import br.gov.sp.fatec.apipixel.core.domain.projection.ColaboradorProjection;
import br.gov.sp.fatec.apipixel.core.domain.repository.ColaboradorRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ColaboradorJpaRepository extends JpaRepository<Colaborador, Long>, ColaboradorRepository {

    @Query(value = """
            select id as id, nome as nome from Colaborador where empresa.id = :empresaId""")
    List<ColaboradorProjection> carregar(Long empresaId);

    Colaborador findColaboradorById(Long id);

    default Optional<Colaborador> carregarColaborador(Long colaboradorId) {
        return findById(colaboradorId);
    }

    default List<Colaborador> carregarTodos(){
        return findAll();
    }
}
