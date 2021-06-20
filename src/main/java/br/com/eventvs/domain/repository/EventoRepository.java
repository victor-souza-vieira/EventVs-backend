package br.com.eventvs.domain.repository;

import br.com.eventvs.domain.enums.StatusEvento;
import br.com.eventvs.domain.model.Evento;
import br.com.eventvs.domain.model.Produtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

    List<Evento> findAllByStatusEvento(StatusEvento statusEvento);
    Optional<List<Evento>> findAllByStatusEventoAndProdutor(StatusEvento statusEvento, Produtor produtor);
}
